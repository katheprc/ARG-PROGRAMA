package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author KathePrc
 * @param <T>
 */
public abstract class DAO<T> {

    /**
     *
     */
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("tpfinalpu");
    protected EntityManager em = EMF.createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void eliminar(T objeto) {
        conectar();
        em.getTransaction().begin();
        if(!em.contains(objeto)){
            em.remove(em.merge(objeto));
        } else {
            System.out.println("El índice no existe");
        }
        em.getTransaction().commit();
        desconectar();
    }

}
