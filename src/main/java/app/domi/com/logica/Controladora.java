
package app.domi.com.logica;

import app.domi.com.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis;
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contrasena) {
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        String mensaje="";
        for (Usuario usu : listaUsuarios) {
            if(usu.getNombreUsuario().equals(usuario)){
                if (usu.getContrasena().equals(contrasena)) {
                    mensaje = "Usuario y contraseña correctos";
                    return mensaje;
                }else{mensaje = "Contraseña incorrecta"; return mensaje;}
                
            }else{mensaje = "Usuario no encontrado";}
        }
        return mensaje;
        
    }
    
}
