package Modulo1.C4.Ejercicio_modificado.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private int matricula;
    private List<String> cursos;
    
    public Estudiante(String nombre, String domicilio, String dni, int matricula) {
        super(nombre, domicilio, dni);
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public List<String> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(String curso) {
        cursos.add(curso);
    }
}