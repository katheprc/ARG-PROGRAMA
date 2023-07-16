package Modulo2.C6.Ejercicio;

import java.sql.*;

public class EjercicioC6_main {
	
	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/punto2";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "root");
			try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumnos")){
				if (!conn.isClosed()) {
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
					System.out.println("- - - - A - L - U - M - N - O - S - - - -");
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
				}
				try (ResultSet rs = stmt.executeQuery()){
					while (rs.next()) {
						System.out.println("");
						System.out.println("Nombre = " + rs.getString("nombre"));
						System.out.println("DNI = " + rs.getString("dni"));
						System.out.println("Libreta Universitaria = " + rs.getInt("libreta_universitaria"));
						System.out.println("");
					}
					rs.close();
				}
				stmt.close();
			}
			try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM profesores")){
				if (!conn.isClosed()) {
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
					System.out.println("- P - R - O - F - E - S - O - R - E - S -");
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
				}
				try (ResultSet rs = stmt.executeQuery()){
					while (rs.next()) {
						System.out.println("");
						System.out.println("Nombre = " + rs.getString("nombre"));
						System.out.println("Legajo = " + rs.getInt("id_legajo"));
						System.out.println("Titulo Universitario = " + rs.getString("titulo_universitario"));
						System.out.println("");
					}
					rs.close();
				}
				stmt.close();
			}
		} catch(SQLException e) {
			System.out.println("Exception: " + e.getMessage());
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
