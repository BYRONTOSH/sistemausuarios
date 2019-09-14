
package com.mycompany.frontendusuarios;

import ec.epn.login.dao.UsuarioDAO;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;



@ManagedBean
public class LoginController 
{
    
    // INYECCIÓN DE DEPENDENCIA A LA INTERFAZ
    @EJB
    private UsuarioDAO usuarioDAO;
    
    
    
    
    
    // VARIABLES
    private String nombreUsuario;
    private String clave;

    
    // FUNCION A SER INVOCADA DESDES LA VISTA
    
    public void login()
    {
        boolean login=false;
        login=usuarioDAO.verificarUsuarioBD(nombreUsuario,clave);
        
        if(login)
        {
            addMessage("CORRECTO");
        }
        else
        {
            addMessage("INCORRECTO");
        }
    }
    
    
    public void addMessage(String summary) {
        
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
    //GET AND SET 
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
            

    
}
