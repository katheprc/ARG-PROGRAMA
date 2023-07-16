package Modulo2.C7.Ejercicio.dao_impl;

import java.sql.Connection;
import java.sql.*;

import Modulo2.C7.Ejercicio.dao.*;

public class ProfesoresDAO_impl implements ProfesoresDAO{

	@Override
	public void getTodosLosProfes(Connection conn, String url) {
		try {
			conn = DriverManager.getConnection(url, "root", "root");
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

		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());

		}
		
	}

}
