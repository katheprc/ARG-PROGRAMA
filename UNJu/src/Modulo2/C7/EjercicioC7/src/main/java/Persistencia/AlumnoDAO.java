package Persistencia;

/**
 *
 * @author KathePrc
 */
public class AlumnoDAO extends DAO {

    public void listarAlumnos() throws Exception {
        try {
            String sql = "SELECT * from alumnos ";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("");
                System.out.println("Libreta Universitaria = " + resultado.getInt("libreta_universitaria"));
                System.out.println("DNI = " + resultado.getString("dni"));
                System.out.println("Nombre = " + resultado.getString("nombre"));
                System.out.println("Apellido = " + resultado.getString("apellido"));
                System.out.println("Dirección = " + resultado.getString("direccion"));
                System.out.println("Fecha de Nacimiento = " + resultado.getString("fecha_nac"));
                System.out.println("telefono = " + resultado.getString("telefono"));
                System.out.println("Carrera = " + resultado.getString("carrera"));

                System.out.println("");
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
