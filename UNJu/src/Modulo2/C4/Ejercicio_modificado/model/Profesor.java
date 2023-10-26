package Modulo1.C4.Ejercicio_modificado.model;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String carrera;
    private List<String> cursosEnsenados;
    
    public Profesor(String nombre, String domicilio, String dni, String carrera) {
        super(nombre, domicilio, dni);
        this.carrera = carrera;
        this.cursosEnsenados = new ArrayList<>();
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public List<String> getCursosEnsenados() {
        return cursosEnsenados;
    }
    
    public void asignarCurso(String curso) {
        cursosEnsenados.add(curso);
    }
}
