package Modulo1.C3.Ejercicio.Entity;

import java.util.*;

public class ProgramaAcademico {
	ArrayList<String> materias = new ArrayList<>();

	public ProgramaAcademico() {
	}


	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias.add(materias);
	}

}
