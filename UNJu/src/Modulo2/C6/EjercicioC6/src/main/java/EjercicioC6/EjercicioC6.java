package EjercicioC6;

import Persistencia.*;

/**
 *
 * @author KathePrc
 */
public class EjercicioC6 {

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
    }
}
