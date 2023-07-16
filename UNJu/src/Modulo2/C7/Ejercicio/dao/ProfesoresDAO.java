package Modulo2.C7.Ejercicio.dao;

import java.sql.Connection;

public interface ProfesoresDAO {
	
	public abstract void getTodosLosProfes(Connection conn, String url);
	
}
