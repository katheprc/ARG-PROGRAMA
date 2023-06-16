package Modulo1.C3.Ejercicio.Entity;

import java.util.*;

public class Profesor extends Empleado {
	
	ArrayList<Curso> cursos = new ArrayList<>();
	
	public Profesor() {
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Curso cursos) {
		this.cursos.add(cursos);
	}
	
	public String cursoToString() {
		
		String curso1 = "";
		
		for (Curso curso : cursos) {
			curso1.concat(curso.getMateria());
			curso1.concat(", ");
		}
		
		return curso1;
	}

	@Override
	public String toString() {
		return "[cursos=" + cursoToString() + "]";
	}
	
	
	
}
