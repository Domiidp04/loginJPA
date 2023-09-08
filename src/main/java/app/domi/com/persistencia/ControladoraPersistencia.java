package app.domi.com.persistencia;

import app.domi.com.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }
    
    
    
}
