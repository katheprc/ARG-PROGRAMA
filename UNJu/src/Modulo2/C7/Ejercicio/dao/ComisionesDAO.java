package Modulo2.C7.Ejercicio.dao;

import java.sql.Connection;

public interface ComisionesDAO {

	public abstract void getTodasLasComisiones(Connection conn, String url);
	
}
