package ec.epn.login.entidades;

import ec.epn.login.entidades.Mensaje;
import ec.epn.login.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-14T11:53:21")
@StaticMetamodel(Codigo.class)
public class Codigo_ { 

    public static volatile SingularAttribute<Codigo, String> codigo;
    public static volatile SingularAttribute<Codigo, Date> fechaInicio;
    public static volatile SingularAttribute<Codigo, Usuario> idUsuario;
    public static volatile ListAttribute<Codigo, Mensaje> mensajeList;
    public static volatile SingularAttribute<Codigo, Date> fechaFin;
    public static volatile SingularAttribute<Codigo, Integer> idCodigo;

}