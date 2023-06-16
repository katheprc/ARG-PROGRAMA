package Modulo1.C3.Ejercicio.Entity;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    
    public Curso(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}
