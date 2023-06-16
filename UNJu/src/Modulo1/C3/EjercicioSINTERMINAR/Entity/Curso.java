package Modulo1.C3.Ejercicio.Entity;

public class Curso {
	
	String comision;
	String materia;

	public Curso() {
	}
	
	public Curso(String comision, String materia) {
		this.comision = comision;
		this.materia = materia;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
