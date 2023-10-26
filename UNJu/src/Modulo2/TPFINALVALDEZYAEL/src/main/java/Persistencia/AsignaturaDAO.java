package Persistencia;

import Entity.Asignatura;
import java.util.List;

/**
 *
 * @author KathePrc
 */
public class AsignaturaDAO extends DAO<Asignatura> {

    public void guardarDao(Asignatura asignatura) {

        guardar(asignatura);

    }
    
    public void eliminarDao(Asignatura asignatura){
        eliminar(asignatura);
    }

    public List<Asignatura> listar() {

        conectar();
        List<Asignatura> lista = em.createQuery("select p from Asignatura p").getResultList();
        desconectar();
        return lista;

    }

}
