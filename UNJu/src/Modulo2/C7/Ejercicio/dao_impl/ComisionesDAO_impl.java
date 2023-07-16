package Modulo2.C7.Ejercicio.dao_impl;

import java.sql.Connection;
import java.sql.*;

import Modulo2.C7.Ejercicio.dao.*;

public class ComisionesDAO_impl implements ComisionesDAO {

	@Override
	public void getTodasLasComisiones(Connection conn, String url) {
		try {
			conn = DriverManager.getConnection(url, "root", "root");
			try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM comisiones")){
				if (!conn.isClosed()) {
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
					System.out.println("- C - O - M - I - S - I - O - N - E - S -");
					System.out.println("- - - - - - - - - - - - - - - - - - - - -");
				}
				try (ResultSet rs = stmt.executeQuery()){
					while (rs.next()) {
						System.out.println("");
						System.out.println("Cantidad de alumnos = " + rs.getInt("cant_alumnos"));
						System.out.println("Tipo comision = " + rs.getString("tipo_comision"));
						System.out.println("Asignatura = " + rs.getString("asignatura"));
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
