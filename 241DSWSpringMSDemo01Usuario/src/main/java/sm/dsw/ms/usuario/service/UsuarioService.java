/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.usuario.service;

/**
 *
 * @author Fabrizio
 */
import java.util.List;
import sm.dsw.ms.usuario.model.Usuario;

/**
 *
 * @author Fabrizio
 */
public interface UsuarioService {
    List<Usuario> findAll();

    List<Usuario> findById(Integer usuario_id);

    Usuario save(Usuario usuario);

    void deleteById(Integer usuario_id);
}

