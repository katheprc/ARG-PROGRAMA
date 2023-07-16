package Modulo2.C7.Ejercicio.dao;

import java.sql.*;

public interface AlumnosDAO {

	public abstract void getTodosLosAlumnos(Connection conn, String url);
	
}
