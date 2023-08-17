package Persistencia;
/**
 *
 * @author KathePrc
 */
public class ProfesorDAO extends DAO {

    public void listarProfesores() throws Exception {
        try {
            String sql = "SELECT * from profesores ";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("");
                System.out.println("ID Legajo = " + resultado.getInt("id_legajo"));
                System.out.println("Nombre = " + resultado.getString("nombre"));
                System.out.println("Apellido = " + resultado.getString("apellido"));
                System.out.println("Fecha de Nacimiento = " + resultado.getString("fecha_nac"));
                System.out.println("Telefono = " + resultado.getString("telefono"));
                System.out.println("Titulo Universitario = " + resultado.getString("titulo_universitario"));
                System.out.println("");
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
