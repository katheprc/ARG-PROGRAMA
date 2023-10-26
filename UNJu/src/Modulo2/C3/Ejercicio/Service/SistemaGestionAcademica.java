package Modulo1.C3.Ejercicio.Service;

import Modulo1.C3.Ejercicio.Entity.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGestionAcademica {

	private List<Persona> personas = new ArrayList<>();
	private List<Curso> cursos = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public void menu() {

		int opcion;

		do {
			System.out.println("----- MENÚ -----");
			System.out.println("1 - Crear nueva persona");
			System.out.println("2 - Eliminar persona");
			System.out.println("3 - Crear curso");
			System.out.println("4 - Eliminar curso");
			System.out.println("5 - Asignar profesor a curso");
			System.out.println("6 - Mostrar información de una persona");
			System.out.println("7 - Listar cursos");
			System.out.println("8 - Asignar estudiante a curso");
			System.out.println("0 - Salir");
			System.out.print("Seleccione una opción: ");
			opcion = leer.nextInt();
			leer.nextLine();

			switch (opcion) {
			case 1:
				crearNuevaPersona();
				break;
			case 2:
				eliminarPersona();
				break;
			case 3:
				crearNuevoCurso();
				break;
			case 4:
				eliminarCurso();
				break;
			case 5:
				asignarProfesorACurso();
				break;
			case 6:
				mostrarInformacion();
				break;
			case 7:
				verCursos();
				break;
			case 8:
				asignarEstudianteACurso();
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Intente nuevamente");
				break;
			}

			System.out.println();

		} while (opcion != 0);
	}

	public void crearNuevaPersona() {
		System.out.println("----- Crear nueva persona -----");
		System.out.println("1. Estudiante");
		System.out.println("2. Profesor");
		System.out.println("3. Empleado");
		System.out.print("Seleccione el tipo de persona: ");
		int opcion = leer.nextInt();
		leer.nextLine();

		System.out.print("Ingrese el nombre: ");
		String nombre = leer.nextLine();
		System.out.print("Ingrese el domicilio: ");
		String domicilio = leer.nextLine();
		System.out.print("Ingrese el DNI: ");
		String dni = leer.nextLine();

		switch (opcion) {
		case 1:
			System.out.print("Ingrese la matrícula del estudiante: ");
			int matricula = leer.nextInt();
			leer.nextLine();
			Estudiante estudiante = new Estudiante(nombre, domicilio, dni, matricula);
			personas.add(estudiante);
			System.out.println("Estudiante creado exitosamente.");
			break;
		case 2:
			System.out.print("Ingrese la carrera del profesor: ");
			String carrera = leer.nextLine();
			Profesor profesor = new Profesor(nombre, domicilio, dni, carrera);
			personas.add(profesor);
			System.out.println("Profesor creado exitosamente.");
			break;
		case 3:
			System.out.print("Ingrese el sector del empleado: ");
			String sector = leer.nextLine();
			System.out.print("Ingrese el sueldo del empleado: ");
			double sueldo = leer.nextDouble();
			System.out.print("Ingrese la antigüedad del empleado: ");
			int antiguedad = leer.nextInt();
			leer.nextLine();
			System.out.print("Ingrese el número de empleado: ");
			int numeroEmpleado = leer.nextInt();
			leer.nextLine();
			Empleado empleado = new Empleado(nombre, domicilio, dni, sector, sueldo, antiguedad, numeroEmpleado);
			personas.add(empleado);
			System.out.println("Empleado creado exitosamente.");
			break;
		default:
			System.out.println("Opción inválida. No se ha creado ninguna persona.");
			break;
		}
	}

	public void eliminarPersona() {
		System.out.println("----- Eliminar persona -----");
		System.out.print("Ingrese el DNI de la persona a eliminar: ");
		String dni = leer.nextLine();

		Persona personaEncontrada = null;

		for (Persona persona : personas) {
			if (persona.getDni().equals(dni)) {
				personaEncontrada = persona;
				break;
			}
		}

		if (personaEncontrada != null) {
			personas.remove(personaEncontrada);
			System.out.println("Persona eliminada exitosamente.");
		} else {
			System.out.println("No se ha encontrado ninguna persona con el DNI especificado.");
		}
	}

	public void crearNuevoCurso() {
		System.out.println("----- Crear nuevo curso -----");
		System.out.print("Ingrese el nombre del curso: ");
		String nombre = leer.nextLine();
		Curso curso = new Curso(nombre);
		cursos.add(curso);
		System.out.println("Curso creado exitosamente.");
	}

	public void eliminarCurso() {
		System.out.println("----- Eliminar curso -----");
		System.out.print("Ingrese el nombre del curso a eliminar: ");
		String nombre = leer.nextLine();

		Curso cursoEncontrado = null;

		for (Curso curso : cursos) {
			if (curso.getNombre().equalsIgnoreCase(nombre)) {
				cursoEncontrado = curso;
				break;
			}
		}

		if (cursoEncontrado != null) {
			cursos.remove(cursoEncontrado);
			System.out.println("Curso eliminado exitosamente.");
		} else {
			System.out.println("No se ha encontrado ningún curso con el nombre especificado.");
		}
	}

	public void asignarProfesorACurso() {
		System.out.println("----- Asignar profesor a curso -----");
		System.out.print("Ingrese el DNI del profesor: ");
		String dniProfesor = leer.nextLine();

		Profesor profesorEncontrado = null;

		for (Persona persona : personas) {
			if (persona instanceof Profesor && persona.getDni().equals(dniProfesor)) {
				profesorEncontrado = (Profesor) persona;
				break;
			}
		}

		if (profesorEncontrado != null) {
			System.out.print("Ingrese el nombre del curso: ");
			String nombreCurso = leer.nextLine();

			Curso cursoEncontrado = null;

			for (Curso curso : cursos) {
				if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
					cursoEncontrado = curso;
					break;
				}
			}

			if (cursoEncontrado != null) {
				cursoEncontrado.agregarProfesor(profesorEncontrado);
				System.out.println("Profesor asignado al curso exitosamente.");
			} else {
				System.out.println("No se ha encontrado ningún curso con el nombre especificado.");
			}
		} else {
			System.out.println("No se ha encontrado ningún profesor con el DNI especificado.");
		}
	}

	public void mostrarInformacion() {
		System.out.println("Ingrese dni de la persona");
		String dni = leer.nextLine();
		Persona persona = null;
		for (Persona persona1 : personas) {
			if (dni.equals(persona1.getDni())) {
				persona = persona1;
			}
		}
		
		if (persona == null) {
			System.out.println("Persona no encontrada. Intente nuevamente.");
		} else {

			System.out.println("Nombre: " + persona.getNombre());
			System.out.println("Domicilio: " + persona.getDomicilio());
			System.out.println("DNI: " + persona.getDni());

			if (persona instanceof Estudiante) {
				Estudiante estudiante = (Estudiante) persona;
				System.out.println("Matrícula: " + estudiante.getMatricula());
				System.out.println("Cursos: " + estudiante.getCursos());
			} else if (persona instanceof Profesor) {
				Profesor profesor = (Profesor) persona;
				System.out.println("Carrera: " + profesor.getCarrera());
				System.out.println("Cursos enseñados: " + profesor.getCursosEnsenados());
			}

			System.out.println();
		}
		
	}
	
	public void verCursos() {
	    System.out.println("----- Cursos existentes -----");
	    if (cursos.isEmpty()) {
	        System.out.println("No hay cursos disponibles.");
	    } else {
	        for (Curso curso : cursos) {
	            System.out.println("Nombre del curso: " + curso.getNombre());
	            if (curso.getProfesores() != null) {
	                System.out.println("Profesor asignado: " + curso.getProfesores());
	            } else {
	                System.out.println("Profesor asignado: No asignado");
	            }
	            System.out.println();
	        }
	    }
	}
	
	public void asignarEstudianteACurso() {
	    System.out.println("----- Asignar estudiante a curso -----");
	    System.out.print("Ingrese el DNI del estudiante: ");
	    String dniEstudiante = leer.nextLine();

	    Estudiante estudianteEncontrado = null;

	    for (Persona persona : personas) {
	        if (persona instanceof Estudiante && persona.getDni().equals(dniEstudiante)) {
	            estudianteEncontrado = (Estudiante) persona;
	            break;
	        }
	    }

	    if (estudianteEncontrado != null) {
	        System.out.print("Ingrese el nombre del curso: ");
	        String nombreCurso = leer.nextLine();

	        Curso cursoEncontrado = null;

	        for (Curso curso : cursos) {
	            if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
	                cursoEncontrado = curso;
	                break;
	            }
	        }

	        if (cursoEncontrado != null) {
	            cursoEncontrado.agregarEstudiante(estudianteEncontrado);
	            System.out.println("Estudiante asignado al curso exitosamente.");
	        } else {
	            System.out.println("No se ha encontrado ningún curso con el nombre especificado.");
	        }
	    } else {
	        System.out.println("No se ha encontrado ningún estudiante con el DNI especificado.");
	    }
	}
}
