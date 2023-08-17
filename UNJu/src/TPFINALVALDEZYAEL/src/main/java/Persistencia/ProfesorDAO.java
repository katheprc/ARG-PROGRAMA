package Persistencia;

import Entity.Asignatura;
import Entity.Profesor;
import java.util.List;

/**
 *
 * @author KathePrc
 */
public class ProfesorDAO extends DAO<Profesor> {

    AsignaturaDAO adao = new AsignaturaDAO();

    public void guardarDao(Profesor profesor) {

        guardar(profesor);

    }

    public void eliminarDao(String legajo) {

        for (Profesor profesor : listar()) {
            for (Asignatura asignatura : adao.listar()) {
                if (asignatura.getProfesor() == profesor) {
                    adao.eliminarDao(asignatura);
                }
            }
            if (profesor.getLegajo().equals(legajo)) {
                eliminar(profesor);
            }
        }
    }

    public List<Profesor> listar() {

        conectar();
        List<Profesor> lista = em.createQuery("select p from Profesor p").getResultList();
        desconectar();
        return lista;

    }

}
