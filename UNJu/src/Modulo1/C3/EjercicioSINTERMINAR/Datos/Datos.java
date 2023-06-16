package Modulo1.C3.Ejercicio.Datos;

import java.util.*;

import Modulo1.C3.Ejercicio.Entity.*;

public class Datos {

	ArrayList<Profesor> profesores = new ArrayList<>();
	ArrayList<Empleado> empleados = new ArrayList<>();
	ArrayList<Estudiante> alumnos = new ArrayList<>();
	ArrayList<Curso> cursos = new ArrayList<>(); 
	ProgramaAcademico carrera = new ProgramaAcademico();
	
	public void automatico() {
	
//		carrera.setNombre("PROGRAMACIÓN");
//		
//		Materia materia1 = new Materia("INTRODUCCIÓN A JAVA", "1 AÑO");
//		Materia materia2 = new Materia("INTRODUCCIÓN A PROGRAMACIÓN", "1 AÑO");
//		Materia materia3 = new Materia("JAVA INTERMEDIO", "2 AÑO");
//		Materia materia4 = new Materia("LÓGICA", "2 AÑO");
//		Materia materia5 = new Materia("JAVA AVANZADO", "3 AÑO");
//		Materia materia6 = new Materia("SPRING", "3 AÑO");
//	
//		carrera.setMaterias(materia1); carrera.setMaterias(materia2); carrera.setMaterias(materia3); carrera.setMaterias(materia4); carrera.setMaterias(materia5); carrera.setMaterias(materia6); 
		
		Curso curso1 = new Curso("A1", "INTRODUCCIÓN A JAVA");
		Curso curso2 = new Curso("A2", "INTRODUCCIÓN A PROGRAMACIÓN");
		Curso curso3 = new Curso("A3", "JAVA INTERMEDIO");
		Curso curso4 = new Curso("A4", "LÓGICA");
		Curso curso5 = new Curso("B1", "JAVA AVANZADO");
		Curso curso6 = new Curso("B4", "JAVA AVANZADO");
		Curso curso7 = new Curso("B5", "JAVA AVANZADO");
		Curso curso8 = new Curso("B7", "SPRING");
		Curso curso9 = new Curso("C2", "JAVA INTERMEDIO");
		Curso curso10 = new Curso("C3", "SPRING");
		
		cursos.add(curso1); cursos.add(curso2); cursos.add(curso3); cursos.add(curso4); cursos.add(curso5); cursos.add(curso6); cursos.add(curso7); cursos.add(curso8); cursos.add(curso9); cursos.add(curso10);
		
		
		Profesor profesor1 = new Profesor();
		
		profesor1.setNombre("JUAN PEREZ");
		profesor1.setDomicilio("CALLE FALSA 123");
		profesor1.setDni("11111111");
		profesor1.setSueldo(25000);
		profesor1.setAntiguedad(39);
		profesor1.setNumEmpleado("11111111");
		profesor1.setCursos(curso1);
		profesor1.setCursos(curso3);
		profesor1.setCursos(curso7);
		
		Profesor profesor2 = new Profesor();
		
		profesor2.setNombre("JUANA MARTINEZ");
		profesor2.setDomicilio("CALLE FALSA 999");
		profesor2.setDni("22222222");
		profesor2.setSueldo(25000);
		profesor2.setAntiguedad(12);
		profesor2.setNumEmpleado("22222222");
		profesor2.setCursos(curso2);
		profesor2.setCursos(curso6);
		profesor2.setCursos(curso10);
		
		Profesor profesor3 = new Profesor();
		
		profesor3.setNombre("VIOLETA ORELLANA");
		profesor3.setDomicilio("CALLE FALSA 789");
		profesor3.setDni("55555555");
		profesor3.setSueldo(25000);
		profesor3.setAntiguedad(6);
		profesor3.setNumEmpleado("55555555");
		profesor3.setCursos(curso4);
		profesor3.setCursos(curso5);
		profesor3.setCursos(curso9);
		profesor3.setCursos(curso8);
		
		profesores.add(profesor1); profesores.add(profesor2); profesores.add(profesor3);
		
		Empleado empleado1 = new Empleado();
		
		empleado1.setNombre("ALBERTO GOMEZ");
		empleado1.setDomicilio("CALLE FALSA 888");
		empleado1.setDni("33333333");
		empleado1.setSueldo(15000);
		empleado1.setAntiguedad(25);
		empleado1.setNumEmpleado("33333333");
		
		empleados.add(empleado1);
		
		Estudiante alumno1 = new Estudiante();
		
		alumno1.setNombre("JUAN GOMEZ");
		alumno1.setDomicilio("CALLE FALSA 1234");
		alumno1.setDni("15486214");
		alumno1.setMatricula("15486214");
		alumno1.setCursos(curso1);
		alumno1.setCursos(curso2);
		alumno1.setCursos(curso4);
		
		
		Estudiante alumno2 = new Estudiante();
		
		alumno2.setNombre("MARITZA ORELLANA");
		alumno2.setDomicilio("CALLE FALSA 124");
		alumno2.setDni("45278545");
		alumno2.setMatricula("45278545");
		alumno2.setCursos(curso9);
		alumno2.setCursos(curso8);
		alumno2.setCursos(curso4);
		
		
		Estudiante alumno3 = new Estudiante();
		
		alumno3.setNombre("GONZALO GOMEZ");
		alumno3.setDomicilio("CALLE FALSA 1524");
		alumno3.setDni("45245545");
		alumno3.setMatricula("45245545");
		alumno3.setCursos(curso6);
		alumno3.setCursos(curso10);
		
		
		Estudiante alumno4 = new Estudiante();
		
		alumno4.setNombre("JONATHAN MULA");
		alumno4.setDomicilio("CALLE FALSA 494");
		alumno4.setDni("95625125");
		alumno4.setMatricula("95625125");
		alumno4.setCursos(curso6);
		alumno4.setCursos(curso4);
		alumno4.setCursos(curso10);
		
		
		Estudiante alumno5 = new Estudiante();
		
		alumno5.setNombre("MILENA MAZA");
		alumno5.setDomicilio("CALLE FALSA 454");
		alumno5.setDni("42156925");
		alumno5.setMatricula("42156925");
		alumno5.setCursos(curso3);
		alumno5.setCursos(curso5);
		
		
		Estudiante alumno6 = new Estudiante();
		
		alumno6.setNombre("KAREN VILA");
		alumno6.setDomicilio("CALLE FALSA 586");
		alumno6.setDni("25632875");
		alumno6.setMatricula("25632875");
		alumno6.setCursos(curso7);
		alumno6.setCursos(curso8);
		
		alumnos.add(alumno1); alumnos.add(alumno2); alumnos.add(alumno3); alumnos.add(alumno4); alumnos.add(alumno5); alumnos.add(alumno6); 
		
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	
	public ArrayList<Estudiante> getAlumnos() {
		return alumnos;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public ProgramaAcademico getCarrera() {
		return carrera;
	}
	
	public void setCursos(Curso curso) {
		this.cursos.add(curso);
	}
	
	public void setProfesores(Profesor profesor) {
		this.profesores.add(profesor);
	}
	
	public void setAlumnos(Estudiante alumno) {
		this.alumnos.add(alumno);
	}
	
	public void setEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
}
