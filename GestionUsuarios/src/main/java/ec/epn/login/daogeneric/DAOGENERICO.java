
package ec.epn.login.daogeneric;

import java.util.List;
import javax.ejb.EJBHome;
import javax.ejb.Local;

// SI QUIERO QUE SEA LOCAL O REMOTO 
@Local
// ACTIVIDADES DE CRUD == EJBHOME
// APLICABLE  A OTRAS CLASES == <E>
public interface DAOGENERICO <E> extends EJBHome
{
    // METODOO GUARDAR
    public void save (E objeto) throws Exception;
    // METODOO ACTUALIZAR
    public void update (E objeto) throws Exception;
    // METODOO ELIMINAR
    public void delete (E objeto) throws Exception;
    // METODOO OBTENER POR UN ID
    public Object getById (Class<E> clases, Object pk) throws Exception;
    // METODOO OBTENER TODOS
    public List<E> getAll (Class<E> clases) throws Exception;
    
    // METODO 
    Integer generarId (String entidad, String id);
    
    
}





