package principal;

import ec.epn.login.dao.UsuarioDAO;
import ec.epn.login.dao.UsuarioDAOImpl;
import ec.epn.login.entidades.Usuario;
import java.util.List;
import javax.ejb.EJB;
import org.apache.commons.codec.digest.DigestUtils;

public class principal {

    // LLAMAR AL EJB 
    @EJB
    UsuarioDAO usuarioDAO;

    public static void main(String[] args) throws Exception {

        UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();

//        Usuario usuario = new Usuario();
//        usuario.setIdUsuario(2);
//        usuario.setNombre("Juan");
//        usuario.setNickname("juan");
//        usuario.setEmail("juan@epn.edu.ec");
//        usuario.setPassword(DigestUtils.md5Hex("12345"));
//        
//        usuarioDAOImpl.save(usuario); 
        List<Usuario> usuarios = usuarioDAOImpl.findAllUsers();

        System.out.println(usuarios.size());
        
        System.out.println(usuarios.get(0).getNombre()+""+usuarios.get(0).getPassword());
        
        boolean valor ;
        valor = usuarioDAOImpl.verificarUsuarioBD("byrontosh","12345");
        System.out.println(valor);
        
    }

}
