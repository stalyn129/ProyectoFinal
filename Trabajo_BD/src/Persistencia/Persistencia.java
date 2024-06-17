/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Persistencia {
    private EntityManagerFactory emf = null;

    public EntityManagerFactory getEntityManagerFactory() {
        return emf = Persistence.createEntityManagerFactory("Trabajo_BDPU");
    }
    public static final Connection getConnection(final EntityManager entityManager) {
          entityManager.getTransaction().begin();
          Connection connection = entityManager.unwrap(java.sql.Connection.class);
          return connection;

    }
}
