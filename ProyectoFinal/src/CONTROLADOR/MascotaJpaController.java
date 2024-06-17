/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import CONTROLADOR.exceptions.NonexistentEntityException;
import CONTROLADOR.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import MODELO__.Cliente;
import MODELO__.Mascota;
import MODELO__.Veterinario;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author alexa
 */
public class MascotaJpaController implements Serializable {

    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mascota mascota) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente idCliente = mascota.getIdCliente();
            if (idCliente != null) {
                idCliente = em.getReference(idCliente.getClass(), idCliente.getIdCliente());
                mascota.setIdCliente(idCliente);
            }
            Veterinario idVeterinario = mascota.getIdVeterinario();
            if (idVeterinario != null) {
                idVeterinario = em.getReference(idVeterinario.getClass(), idVeterinario.getIdVeterinario());
                mascota.setIdVeterinario(idVeterinario);
            }
            em.persist(mascota);
            if (idCliente != null) {
                idCliente.getMascotaCollection().add(mascota);
                idCliente = em.merge(idCliente);
            }
            if (idVeterinario != null) {
                idVeterinario.getMascotaCollection().add(mascota);
                idVeterinario = em.merge(idVeterinario);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMascota(mascota.getIdMascota()) != null) {
                throw new PreexistingEntityException("Mascota " + mascota + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mascota mascota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota persistentMascota = em.find(Mascota.class, mascota.getIdMascota());
            Cliente idClienteOld = persistentMascota.getIdCliente();
            Cliente idClienteNew = mascota.getIdCliente();
            Veterinario idVeterinarioOld = persistentMascota.getIdVeterinario();
            Veterinario idVeterinarioNew = mascota.getIdVeterinario();
            if (idClienteNew != null) {
                idClienteNew = em.getReference(idClienteNew.getClass(), idClienteNew.getIdCliente());
                mascota.setIdCliente(idClienteNew);
            }
            if (idVeterinarioNew != null) {
                idVeterinarioNew = em.getReference(idVeterinarioNew.getClass(), idVeterinarioNew.getIdVeterinario());
                mascota.setIdVeterinario(idVeterinarioNew);
            }
            mascota = em.merge(mascota);
            if (idClienteOld != null && !idClienteOld.equals(idClienteNew)) {
                idClienteOld.getMascotaCollection().remove(mascota);
                idClienteOld = em.merge(idClienteOld);
            }
            if (idClienteNew != null && !idClienteNew.equals(idClienteOld)) {
                idClienteNew.getMascotaCollection().add(mascota);
                idClienteNew = em.merge(idClienteNew);
            }
            if (idVeterinarioOld != null && !idVeterinarioOld.equals(idVeterinarioNew)) {
                idVeterinarioOld.getMascotaCollection().remove(mascota);
                idVeterinarioOld = em.merge(idVeterinarioOld);
            }
            if (idVeterinarioNew != null && !idVeterinarioNew.equals(idVeterinarioOld)) {
                idVeterinarioNew.getMascotaCollection().add(mascota);
                idVeterinarioNew = em.merge(idVeterinarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = mascota.getIdMascota();
                if (findMascota(id) == null) {
                    throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.");
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
            Mascota mascota;
            try {
                mascota = em.getReference(Mascota.class, id);
                mascota.getIdMascota();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.", enfe);
            }
            Cliente idCliente = mascota.getIdCliente();
            if (idCliente != null) {
                idCliente.getMascotaCollection().remove(mascota);
                idCliente = em.merge(idCliente);
            }
            Veterinario idVeterinario = mascota.getIdVeterinario();
            if (idVeterinario != null) {
                idVeterinario.getMascotaCollection().remove(mascota);
                idVeterinario = em.merge(idVeterinario);
            }
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mascota> findMascotaEntities() {
        return findMascotaEntities(true, -1, -1);
    }

    public List<Mascota> findMascotaEntities(int maxResults, int firstResult) {
        return findMascotaEntities(false, maxResults, firstResult);
    }

    private List<Mascota> findMascotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mascota.class));
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

    public Mascota findMascota(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascota.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mascota> rt = cq.from(Mascota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
