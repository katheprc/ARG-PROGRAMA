package Entity;

import Entity.Profesor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-16T17:08:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ { 

    public static volatile SingularAttribute<Asignatura, Integer> id_asignatura;
    public static volatile SingularAttribute<Asignatura, Profesor> profesor;
    public static volatile SingularAttribute<Asignatura, String> nombre;

}