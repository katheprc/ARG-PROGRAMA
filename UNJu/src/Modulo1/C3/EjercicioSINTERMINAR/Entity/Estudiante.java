package Modulo1.C3.Ejercicio.Entity;

import java.util.ArrayList;

public class Estudiante extends Persona {
	String matricula;
	ArrayList<Curso> cursos = new ArrayList<>();
	
	public Estudiante() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
			curso1.concat(curso.getComision());
		}
		
		return curso1;
	}

	@Override
	
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", cursos=" + cursoToString() + "]";
	}

	
}
