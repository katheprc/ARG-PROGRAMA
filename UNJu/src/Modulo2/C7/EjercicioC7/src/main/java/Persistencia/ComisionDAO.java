package Persistencia;

/**
 *
 * @author KathePrc
 */
public class ComisionDAO extends DAO{
    
    public void listarComisiones() throws Exception {
        try {
            String sql = "SELECT * from comisiones ";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("");
                System.out.println("ID Codigo = " + resultado.getInt("id_codigo"));
                System.out.println("Cantidad de alumnos = " + resultado.getInt("cant_alumnos"));
                System.out.println("Tipo comision = " + resultado.getInt("tipo_comision"));
                System.out.println("Asignatura = " + resultado.getString("asignatura"));
                System.out.println("");
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}