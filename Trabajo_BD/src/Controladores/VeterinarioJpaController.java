/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Mascota;
import Modelo.Veterinario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alexa
 */
public class VeterinarioJpaController implements Serializable {

    public VeterinarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Trabajo_BDPU");;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Veterinario veterinario) throws PreexistingEntityException, Exception {
        if (veterinario.getMascotaCollection() == null) {
            veterinario.setMascotaCollection(new ArrayList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Mascota> attachedMascotaCollection = new ArrayList<Mascota>();
            for (Mascota mascotaCollectionMascotaToAttach : veterinario.getMascotaCollection()) {
                mascotaCollectionMascotaToAttach = em.getReference(mascotaCollectionMascotaToAttach.getClass(), mascotaCollectionMascotaToAttach.getIdMascota());
                attachedMascotaCollection.add(mascotaCollectionMascotaToAttach);
            }
            veterinario.setMascotaCollection(attachedMascotaCollection);
            em.persist(veterinario);
            for (Mascota mascotaCollectionMascota : veterinario.getMascotaCollection()) {
                Veterinario oldIdVeterinarioOfMascotaCollectionMascota = mascotaCollectionMascota.getIdVeterinario();
                mascotaCollectionMascota.setIdVeterinario(veterinario);
                mascotaCollectionMascota = em.merge(mascotaCollectionMascota);
                if (oldIdVeterinarioOfMascotaCollectionMascota != null) {
                    oldIdVeterinarioOfMascotaCollectionMascota.getMascotaCollection().remove(mascotaCollectionMascota);
                    oldIdVeterinarioOfMascotaCollectionMascota = em.merge(oldIdVeterinarioOfMascotaCollectionMascota);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVeterinario(veterinario.getIdVeterinario()) != null) {
                throw new PreexistingEntityException("Veterinario " + veterinario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Veterinario veterinario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Veterinario persistentVeterinario = em.find(Veterinario.class, veterinario.getIdVeterinario());
            Collection<Mascota> mascotaCollectionOld = persistentVeterinario.getMascotaCollection();
            Collection<Mascota> mascotaCollectionNew = veterinario.getMascotaCollection();
            Collection<Mascota> attachedMascotaCollectionNew = new ArrayList<Mascota>();
            for (Mascota mascotaCollectionNewMascotaToAttach : mascotaCollectionNew) {
                mascotaCollectionNewMascotaToAttach = em.getReference(mascotaCollectionNewMascotaToAttach.getClass(), mascotaCollectionNewMascotaToAttach.getIdMascota());
                attachedMascotaCollectionNew.add(mascotaCollectionNewMascotaToAttach);
            }
            mascotaCollectionNew = attachedMascotaCollectionNew;
            veterinario.setMascotaCollection(mascotaCollectionNew);
            veterinario = em.merge(veterinario);
            for (Mascota mascotaCollectionOldMascota : mascotaCollectionOld) {
                if (!mascotaCollectionNew.contains(mascotaCollectionOldMascota)) {
                    mascotaCollectionOldMascota.setIdVeterinario(null);
                    mascotaCollectionOldMascota = em.merge(mascotaCollectionOldMascota);
                }
            }
            for (Mascota mascotaCollectionNewMascota : mascotaCollectionNew) {
                if (!mascotaCollectionOld.contains(mascotaCollectionNewMascota)) {
                    Veterinario oldIdVeterinarioOfMascotaCollectionNewMascota = mascotaCollectionNewMascota.getIdVeterinario();
                    mascotaCollectionNewMascota.setIdVeterinario(veterinario);
                    mascotaCollectionNewMascota = em.merge(mascotaCollectionNewMascota);
                    if (oldIdVeterinarioOfMascotaCollectionNewMascota != null && !oldIdVeterinarioOfMascotaCollectionNewMascota.equals(veterinario)) {
                        oldIdVeterinarioOfMascotaCollectionNewMascota.getMascotaCollection().remove(mascotaCollectionNewMascota);
                        oldIdVeterinarioOfMascotaCollectionNewMascota = em.merge(oldIdVeterinarioOfMascotaCollectionNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = veterinario.getIdVeterinario();
                if (findVeterinario(id) == null) {
                    throw new NonexistentEntityException("The veterinario with id " + id + " no longer exists.");
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
            Veterinario veterinario;
            try {
                veterinario = em.getReference(Veterinario.class, id);
                veterinario.getIdVeterinario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The veterinario with id " + id + " no longer exists.", enfe);
            }
            Collection<Mascota> mascotaCollection = veterinario.getMascotaCollection();
            for (Mascota mascotaCollectionMascota : mascotaCollection) {
                mascotaCollectionMascota.setIdVeterinario(null);
                mascotaCollectionMascota = em.merge(mascotaCollectionMascota);
            }
            em.remove(veterinario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Veterinario> findVeterinarioEntities() {
        return findVeterinarioEntities(true, -1, -1);
    }

    public List<Veterinario> findVeterinarioEntities(int maxResults, int firstResult) {
        return findVeterinarioEntities(false, maxResults, firstResult);
    }

    private List<Veterinario> findVeterinarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Veterinario.class));
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

    public Veterinario findVeterinario(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Veterinario.class, id);
        } finally {
            em.close();
        }
    }

    public int getVeterinarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Veterinario> rt = cq.from(Veterinario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
