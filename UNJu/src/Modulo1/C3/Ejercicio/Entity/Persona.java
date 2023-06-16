package Modulo1.C3.Ejercicio.Entity;

public class Persona {
	
	private String nombre;
    private String domicilio;
    private String dni;
    
    public Persona(String nombre, String domicilio, String dni) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
    
    public String getDni() {
        return dni;
    }
}
