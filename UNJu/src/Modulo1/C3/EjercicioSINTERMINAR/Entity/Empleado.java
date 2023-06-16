package Modulo1.C3.Ejercicio.Entity;

public class Empleado extends Persona {
	
	private String sector, numEmpleado;
	private double sueldo, antiguedad;
	
	public Empleado() {
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(double antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [sector=" + sector + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + ", antiguedad="
				+ antiguedad + "]";
	}
	
	
	
}
