package Persistencia;

/**
 *
 * @author KathePrc
 */
public class AsignaturaDAO extends DAO {

    public void listarAsignaturas() throws Exception {
        try {
            String sql = "SELECT * from asignatura ";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("");
                System.out.println("ID de asignatura = " + resultado.getInt("id_asignatura"));
                System.out.println("Nombre de asignatura = " + resultado.getString("nombre_asignatura"));
                System.out.println("Horas cátedra = " + resultado.getInt("horas_catedra"));
                System.out.println("");
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
