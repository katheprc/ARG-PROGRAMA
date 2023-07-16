package Modulo2.C7.Ejercicio.dao;

import java.sql.Connection;

public interface AsignaturasDAO {

	public abstract void getTodasLasAsignaturas(Connection conn, String url);
	
}
