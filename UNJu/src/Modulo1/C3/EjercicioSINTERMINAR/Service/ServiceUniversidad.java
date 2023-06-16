package Modulo1.C3.Ejercicio.Service;

import Modulo1.C3.Ejercicio.Entity.*;
import Modulo1.C3.Ejercicio.Datos.*;
import java.util.*;

public class ServiceUniversidad {
	
	Scanner leer = new Scanner(System.in);
	Datos datos = new Datos();
	
	public void menu() {
		
		datos.automatico();
		
		int opc;
		
		do {
			
			System.out.println(""); System.out.println("- - - M - E - N - U - - -"); System.out.println("");
			System.out.println("1 - Buscar Persona"); System.out.println("");
			System.out.println("2 - Buscar Curso"); System.out.println("");
			System.out.println("3 - Otras Opciones");
			System.out.println("0 - Salir"); System.out.println(""); System.out.println("");
		
			System.out.print("Ingrese opción");
			opc = leer.nextInt();
			leer.nextLine(); System.out.println(""); System.out.println("");
			
			switch (opc) {
			
				case 1: buscarPersona(); break;
				case 2: buscarCurso(); break;
				case 3: menu2(); break;
				case 0: break;
				default: System.out.println("Ingrese nuevamente la opción"); System.out.println("");
				
			}
			
		} while (opc != 0); 
		
	}
	
	public void menu2() {
		
		int opc;
		
		do {
			
			System.out.println(""); System.out.println("- - - M - E - N - U - - -"); System.out.println("");
			System.out.println("1 - Crear Persona"); System.out.println("");
			System.out.println("2 - Modificar Persona"); System.out.println("");
			System.out.println("0 - Volver al menú anterior"); System.out.println(""); System.out.println("");
		
			System.out.print("Ingrese opción");
			opc = leer.nextInt();
			leer.nextLine(); System.out.println(""); System.out.println("");
			
			switch (opc) {
			
				case 1: crearPersona(); break;
				//case 2: modificarPersona(); break;
				case 0: break;
				default: System.out.println("Ingrese nuevamente la opción"); System.out.println("");
				
			}
			
		} while (opc != 0); 
		
	}
	
	public void buscarPersona() {
		
		System.out.println("Ingrese DNI de la persona a buscar: ");
		String dni = leer.nextLine();
		
		for (Estudiante alumno : datos.getAlumnos()) {
			if (alumno.getDni().equals(dni)) {
				System.out.println("La persona fue encontrada en la lista alumnos");
				System.out.println("nombre="+alumno.getNombre());
				System.out.println("dni="+alumno.getDni());
				System.out.println("domicilio="+alumno.getDomicilio());
				System.out.println(alumno.toString());
			}
		}
		
		for (Profesor profesor : datos.getProfesores()) {
			if (profesor.getDni().equals(dni)) {
				System.out.println("La persona fue encontrada en la lista profesores");
				System.out.println("nombre="+profesor.getNombre());
				System.out.println("dni="+profesor.getDni());
				System.out.println("domicilio="+profesor.getDomicilio());
				System.out.println("antiguedad=" + profesor.getAntiguedad());
				System.out.println("sueldo="+profesor.getSueldo());
				System.out.println("numero de empleado=" + profesor.getNumEmpleado());
				System.out.println(profesor.toString());
			}
		}
		
		for (Empleado empleado : datos.getEmpleados()) {
			if (empleado.getDni().equals(dni)) {
				System.out.println("La persona fue encontrada en la lista empleados");
				System.out.println("nombre="+empleado.getNombre());
				System.out.println("dni="+empleado.getDni());
				System.out.println("domicilio="+empleado.getDomicilio());
				System.out.println("antiguedad=" + empleado.getAntiguedad());
				System.out.println("sueldo="+empleado.getSueldo());
				System.out.println("numero de empleado=" + empleado.getNumEmpleado());
				System.out.println(empleado.toString());
			}
		}
	}
	
	public Curso buscarCurso(){
		
		String nombre = leer.nextLine().toUpperCase();
		
		Curso curso0 = null;
		
		for (Curso curso1 : datos.getCursos()) {
			if (curso1.getComision().equals(nombre)) {
				curso0 = curso1;
			}
		}
		
		return curso0;
			
	}
	
	public void mostrarCursos() {
		
		for (Curso curso1 : datos.getCursos()) {
			
			System.out.println(curso1.toString());
			
		}
		
}
	
	public void crearPersona() {
		
		int opc;
		
		do {
			
			System.out.println(""); System.out.println("- - - M - E - N - U - - -"); System.out.println("");
			System.out.println("1 - Crear Alumno"); System.out.println("");
			System.out.println("2 - Crear Profesor"); System.out.println("");
			System.out.println("3 - Crear Empleado"); System.out.println("");
			System.out.println("0 - Volver al menú anterior"); System.out.println(""); System.out.println("");
		
			System.out.print("Ingrese opción");
			opc = leer.nextInt();
			leer.nextLine(); System.out.println(""); System.out.println("");
			
			switch (opc) {
			
				case 1: crearAlumno(); break;
				case 2: crearProfesor(); break;
				case 3: crearEmpleado(); break;
				case 0: break;
				default: System.out.println("Ingrese nuevamente la opción"); System.out.println("");
				
			}
			
		} while (opc != 0); 
				
	}
	
	public void crearAlumno() {
		
		Estudiante alumno = new Estudiante();
		
		System.out.println("Ingrese nombre");
		alumno.setNombre(leer.nextLine().toUpperCase());
		
		System.out.println("Ingrese DNI");
		alumno.setDni(leer.nextLine());
		alumno.setMatricula(alumno.getDni());
		
		System.out.println("Ingrese domicilio");
		alumno.setDomicilio(leer.nextLine().toUpperCase());
		
		System.out.println("Ingrese las comisiones separadas por enter. A continuacion se detallan las comisiones disponibles: ");
		mostrarCursos();
		do {
			
			Curso curso = buscarCurso();
			if (curso != null) {
				alumno.setCursos(curso);
			} else {
				System.out.println("Ingreso concluido");
				break;
			}
			
		} while (true);
		
	}
	
	public void crearProfesor() {
		
		Profesor profesor = new Profesor();
		
		System.out.println("Ingrese nombre");
		profesor.setNombre(leer.nextLine().toUpperCase());
		
		System.out.println("Ingrese dni");
		profesor.setDni(leer.nextLine().toUpperCase());
		profesor.setNumEmpleado(profesor.getDni());
		
		System.out.println("Ingrese domicilio");
		profesor.setDomicilio(leer.nextLine().toUpperCase());
		
		profesor.setSector("PROFESOR");
		
		profesor.setAntiguedad(0);
		
		profesor.setSueldo(25000);
		
		System.out.println("Ingrese los cursos del profesor. Para dejar de ingresar ingrese 'null'");
		
		do {
			mostrarCursos();
			
			Curso curso = buscarCurso();
			if (curso != null) {
				profesor.setCursos(curso);
			} else {
				System.out.println("Ingreso concluido");
				break;
			}
			
		} while (true);
		
		
	}
	
	/*
	public void crearCurso() {
		
		boolean encontrado = false;
		Curso curso = new Curso();
		
		do {
			
			System.out.println("Ingrese comisión. EJEMPLO: A1");
			String nombre = leer.nextLine().toUpperCase();
			
			if (nombre.equals("NULL")) {
				encontrado = true;
				break;
			}
			
			encontrado = false;
			
			for (Curso curso1 : datos.getCursos()) {
				if (curso1.getComision().equals(nombre)) {
					System.out.println("La comisión ya existe, ingrese otra.");
					encontrado = true;
					break;
				}
			}
			
			if (encontrado == false) {
				
				System.out.println("Ingrese nombre de la materia. A continuación se detallan las materias de la carrera: ");
				mostrarMaterias();
				int aux = 0;
				
				curso.setComision(nombre);
				curso.setMateria(leer.nextLine());
				
				for (Materia materia : datos.getCarrera().getMaterias()) {
					
					if (materia.getNombre().equals(curso.getMateria())){
						
						break;
						
					} else {
						aux++;
					}
					
				}
				
				if (aux == datos.getCarrera().getMaterias().size()) {
					
					System.out.println("Materia no encontrada, vuelva a intentarlo nuevamente.");
					encontrado = true;
					
				}

			}
		
		} while (encontrado);
		
	}
	*/
	
	public String mostrarMaterias() {
		return datos.getCarrera().getMaterias().toString();
	}
	
	public void crearEmpleado() {
		
	}
	
//	public void crearCurso() {
//		
//		Curso curso = new Curso();
//		
//		System.out.println("Ingrese comision. ej: A1");
//		curso.setComision(leer.nextLine().toUpperCase());
//		
//		System.out.println("Ingrese nombre de la materia: ");
//		curso.setMateria(leer.nextLine().toUpperCase());
//		
//		datos.setCursos(curso);
//		
//	}
	
}
