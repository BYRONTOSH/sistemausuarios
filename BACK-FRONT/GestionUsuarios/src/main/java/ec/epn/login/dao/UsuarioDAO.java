
package ec.epn.login.dao;

import ec.epn.login.daogeneric.DAOGENERICO;
import ec.epn.login.entidades.Usuario;
import java.util.List;
import javax.ejb.Local;


@Local
public interface UsuarioDAO extends DAOGENERICO<Usuario>
{
 
    public List<Usuario> findAllUsers();
    
    public boolean verificarUsuarioBD(String nickName, String password);
    
}
