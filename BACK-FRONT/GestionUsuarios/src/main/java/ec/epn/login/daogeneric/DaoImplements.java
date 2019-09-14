
package ec.epn.login.daogeneric;

import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.EJBMetaData;
import javax.ejb.Handle;
import javax.ejb.HomeHandle;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;



// HACER TRANSACCIONALIDAD HACIA LAS ENTIDADES 
@Stateless
// TIPO DE TRANSACCIONALIDAD 
@TransactionManagement(TransactionManagementType.CONTAINER)

// IMPLEMENTAR LA INTERFAZ Y POR ENDE IMPORTAR TODOS LOS METODOS 
// DE LA INTERFAZ
public class DaoImplements<E> implements DAOGENERICO<E>
{

    // LE DEFINE DONDE ESTA LA UNIDAD DE  (PERSISTENCIA== (ARCHIVO DE CONEXIÓN A LA BDD)
   // @PersistenceContext (unitName = "loginPU")
    // GESTOR PARA ALMACENAR LA ENTIDAD EN LA BDD DE FORMA SEGURA 
    // Y NO SOLO CON LA ANOTACIÓN @Entity DE LA ENTIDAD MAPEADA CONVERTIDA A CLASE
    
     
    private EntityManager entityManager = Persistence.createEntityManagerFactory("loginPU").createEntityManager();

    
        // SE CREA LA FUNCIÓN GET
    public EntityManager getEntityManager() {
        return entityManager;
    }

    
    
    @Override
    public void save(E objeto) throws Exception 
    { 
        entityManager.persist(objeto);
    }

    
    
    @Override
    public void update(E objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(E objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(Class<E> clases, Object pk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> getAll(Class<E> clases) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer generarId(String entidad, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Handle handle) throws RemoteException, RemoveException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Object o) throws RemoteException, RemoveException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EJBMetaData getEJBMetaData() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HomeHandle getHomeHandle() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
