package Modulo1.C4;

public class Conexion {
	private static Conexion instancia;
	
	private Conexion() {
	}
	
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
			
		}
		return instancia;
	}
}
