package Modulo1.C4;

public class PruebaDePunto7 {

	
	public static void main(String[] args) {
		
		Conexion c = Conexion.getInstancia();
		
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
		
	}	
	
}
