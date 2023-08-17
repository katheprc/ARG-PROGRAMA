package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_asignatura = 0;

    private String nombre;

    @ManyToOne
    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public Asignatura(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public int getIdAsignatura() {
        return id_asignatura;
    }

    public void setIdAsignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
