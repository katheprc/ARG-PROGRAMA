package Modulo1.C4.Ejercicio_modificado.model;

import java.util.ArrayList;
import java.util.List;

public class ProgramaAcademico {
    private String nombre;
    private List<Curso> cursos;
    
    public ProgramaAcademico(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
}
