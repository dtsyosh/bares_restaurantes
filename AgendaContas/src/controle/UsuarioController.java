/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author yosh
 */
public class UsuarioController {
    Usuario diego = new Usuario("Diego");
    Usuario geovana = new Usuario("Geovana");
    
    public List<Usuario> getUsuarios() {
        List<Usuario> listaUsuario = new ArrayList();
        
        listaUsuario.add(this.diego);
        listaUsuario.add(this.geovana);
        
        return listaUsuario;
    }
    
    
}
