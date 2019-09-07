/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.epn.login.dao;

import ec.epn.login.daogeneric.DaoImplements;
import ec.epn.login.entidades.Usuario;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;




public class UsuarioDAOImpl extends DaoImplements<Usuario> {

    public List<Usuario> findAllUsers() 
    {
        Query consulta = getEntityManager().createNamedQuery("Usuario.findAll");
        
        List<Usuario> listUusario = consulta.getResultList();
        
        return listUusario;
    }
    
    
    public boolean verificarUsuarioBD(String nickName, String password)
    {
        try {
            StringBuilder query = new StringBuilder("select u from usuario u where"
                + "u.nickname =1? and u.password =2?");
        Query consulta = getEntityManager().createQuery(query.toString());
        consulta.setParameter(1,nickName);
        // PARA LA CONTRASEÑA SEGURA 
        //consulta.setParameter(2,DigestUtils.md5Hex(password));
        consulta.setParameter(2,password);
        Usuario usuario = (Usuario)consulta.getSingleResult();
        if(usuario != null)
        {
            return true;
        }else
        {
            return  false;
        }
        } catch (EntityNotFoundException e) 
        {
            
            return false;
        }
        
        
    }
}



