/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import CONTROLADOR.exceptions.NonexistentEntityException;
import CONTROLADOR.exceptions.PreexistingEntityException;
import MODELO__.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import MODELO__.Mascota;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author alexa
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        if (cliente.getMascotaCollection() == null) {
            cliente.setMascotaCollection(new ArrayList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Mascota> attachedMascotaCollection = new ArrayList<Mascota>();
            for (Mascota mascotaCollectionMascotaToAttach : cliente.getMascotaCollection()) {
                mascotaCollectionMascotaToAttach = em.getReference(mascotaCollectionMascotaToAttach.getClass(), mascotaCollectionMascotaToAttach.getIdMascota());
                attachedMascotaCollection.add(mascotaCollectionMascotaToAttach);
            }
            cliente.setMascotaCollection(attachedMascotaCollection);
            em.persist(cliente);
            for (Mascota mascotaCollectionMascota : cliente.getMascotaCollection()) {
                Cliente oldIdClienteOfMascotaCollectionMascota = mascotaCollectionMascota.getIdCliente();
                mascotaCollectionMascota.setIdCliente(cliente);
                mascotaCollectionMascota = em.merge(mascotaCollectionMascota);
                if (oldIdClienteOfMascotaCollectionMascota != null) {
                    oldIdClienteOfMascotaCollectionMascota.getMascotaCollection().remove(mascotaCollectionMascota);
                    oldIdClienteOfMascotaCollectionMascota = em.merge(oldIdClienteOfMascotaCollectionMascota);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getIdCliente()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getIdCliente());
            Collection<Mascota> mascotaCollectionOld = persistentCliente.getMascotaCollection();
            Collection<Mascota> mascotaCollectionNew = cliente.getMascotaCollection();
            Collection<Mascota> attachedMascotaCollectionNew = new ArrayList<Mascota>();
            for (Mascota mascotaCollectionNewMascotaToAttach : mascotaCollectionNew) {
                mascotaCollectionNewMascotaToAttach = em.getReference(mascotaCollectionNewMascotaToAttach.getClass(), mascotaCollectionNewMascotaToAttach.getIdMascota());
                attachedMascotaCollectionNew.add(mascotaCollectionNewMascotaToAttach);
            }
            mascotaCollectionNew = attachedMascotaCollectionNew;
            cliente.setMascotaCollection(mascotaCollectionNew);
            cliente = em.merge(cliente);
            for (Mascota mascotaCollectionOldMascota : mascotaCollectionOld) {
                if (!mascotaCollectionNew.contains(mascotaCollectionOldMascota)) {
                    mascotaCollectionOldMascota.setIdCliente(null);
                    mascotaCollectionOldMascota = em.merge(mascotaCollectionOldMascota);
                }
            }
            for (Mascota mascotaCollectionNewMascota : mascotaCollectionNew) {
                if (!mascotaCollectionOld.contains(mascotaCollectionNewMascota)) {
                    Cliente oldIdClienteOfMascotaCollectionNewMascota = mascotaCollectionNewMascota.getIdCliente();
                    mascotaCollectionNewMascota.setIdCliente(cliente);
                    mascotaCollectionNewMascota = em.merge(mascotaCollectionNewMascota);
                    if (oldIdClienteOfMascotaCollectionNewMascota != null && !oldIdClienteOfMascotaCollectionNewMascota.equals(cliente)) {
                        oldIdClienteOfMascotaCollectionNewMascota.getMascotaCollection().remove(mascotaCollectionNewMascota);
                        oldIdClienteOfMascotaCollectionNewMascota = em.merge(oldIdClienteOfMascotaCollectionNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = cliente.getIdCliente();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(BigDecimal id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getIdCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            Collection<Mascota> mascotaCollection = cliente.getMascotaCollection();
            for (Mascota mascotaCollectionMascota : mascotaCollection) {
                mascotaCollectionMascota.setIdCliente(null);
                mascotaCollectionMascota = em.merge(mascotaCollectionMascota);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
