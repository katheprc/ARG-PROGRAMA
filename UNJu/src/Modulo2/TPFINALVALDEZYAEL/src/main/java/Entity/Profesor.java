package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author KathePrc
 */
@Entity
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_profesor = 0;
    private String legajo, nombres, apellidos, telefono;
    
    public Profesor() {
    }

    public Profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Profesor(String legajo, String nombres, String apellidos, String telefono) {
        this.legajo = legajo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public int getIdProfesor() {
        return id_profesor;
    }

    public void setIdProfesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
