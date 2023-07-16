package Modulo2.C7.Ejercicio.dao_impl;

import java.sql.*;

import Modulo2.C7.Ejercicio.dao.*;

public class AsignaturasDAO_impl implements AsignaturasDAO {

	@Override
	public void getTodasLasAsignaturas(Connection conn, String url) {
		try {
			conn = DriverManager.getConnection(url, "root", "root");
			try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM asignatura")){
				if (!conn.isClosed()) {
					System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
					System.out.println("- A - S - I - G - N - A - T - U - R - A - S -");
					System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
				}
				try (ResultSet rs = stmt.executeQuery()){
					while (rs.next()) {
						System.out.println("");
						System.out.println("ID de asignatura = " + rs.getInt("id_asignatura"));
						System.out.println("Nombre de asignatura = " + rs.getString("nombre_asignatura"));
						System.out.println("Horas cátedra = " + rs.getInt("horas_catedra"));
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
