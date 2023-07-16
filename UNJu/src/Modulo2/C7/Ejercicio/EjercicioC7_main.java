package Modulo2.C7.Ejercicio;

import java.sql.*;
import Modulo2.C7.Ejercicio.dao_impl.*;

public class EjercicioC7_main {
	
	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/punto2";
		Connection conn = null;
		try {
			
			AlumnosDAO_impl alum_imp = new AlumnosDAO_impl();
			alum_imp.getTodosLosAlumnos(conn, url);
			
			ProfesoresDAO_impl prof_imp = new ProfesoresDAO_impl();
			prof_imp.getTodosLosProfes(conn, url);
			
			AsignaturasDAO_impl asig_imp = new AsignaturasDAO_impl();
			asig_imp.getTodasLasAsignaturas(conn, url);
			
			ComisionesDAO_impl com_imp = new ComisionesDAO_impl();
			com_imp.getTodasLasComisiones(conn, url);
			
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
	
}
