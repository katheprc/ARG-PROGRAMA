package Modulo1.C3.Ejercicio.Entity;

public class Materia {
	
	String nombre, anho;

	public Materia() {
	}

	public Materia(String nombre, String anho) {
		this.nombre = nombre;
		this.anho = anho;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnho() {
		return anho;
	}

	public void setAnho(String anho) {
		this.anho = anho;
	}
	
}
