package EjercicioC7;

/**
 *
 * @author KathePrc
 */
import Persistencia.AlumnoDAO;
import Persistencia.AsignaturaDAO;
import Persistencia.ComisionDAO;
import Persistencia.ProfesorDAO;

/**
 *
 * @author KathePrc
 */
public class EjercicioC7 {

    public static void main(String[] args) throws Exception {

        AlumnoDAO adao = new AlumnoDAO();
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - A - L - U - M - N - O - S - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        adao.listarAlumnos();

        ProfesorDAO pdao = new ProfesorDAO();
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- P - R - O - F - E - S - O - R - E - S -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        pdao.listarProfesores();
        
        AsignaturaDAO asdao = new AsignaturaDAO();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- A - S - I - G - N - A - T - U - R - A - S -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
        asdao.listarAsignaturas();

        ComisionDAO cdao = new ComisionDAO();
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- C - O - M - I - S - I - O - N - E - S -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        cdao.listarComisiones();
    }
}

