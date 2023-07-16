package Modulo2.C7.Ejercicio.dao_impl;

import Modulo2.C7.Ejercicio.dao.*;
import java.sql.*;

public class AlumnosDAO_impl implements AlumnosDAO {

	@Override
	public void getTodosLosAlumnos(Connection conn, String url) {
		try {
			conn = DriverManager.getConnection(url, "root", "root");
			try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumnos")) {
				if (!conn.isClosed()) {
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
					System.out.println("- - - - A - L - U - M - N - O - S - - - -");
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
				}
				try (ResultSet rs = stmt.executeQuery()) {
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

		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());

		}

	}

}
