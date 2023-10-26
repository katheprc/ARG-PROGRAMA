package Modulo1.C3.Ejercicio.Entity;

public class Empleado extends Persona {
    private String sector;
    private double sueldo;
    private int antiguedad;
    private int numeroEmpleado;
    
    public Empleado(String nombre, String domicilio, String dni, String sector, double sueldo, int antiguedad, int numeroEmpleado) {
        super(nombre, domicilio, dni);
        this.sector = sector;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.numeroEmpleado = numeroEmpleado;
    }
    
    public String getSector() {
        return sector;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
}