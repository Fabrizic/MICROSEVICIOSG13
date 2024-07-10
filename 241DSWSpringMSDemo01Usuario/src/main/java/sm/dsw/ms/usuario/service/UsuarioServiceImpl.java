package sm.dsw.ms.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.usuario.model.Usuario;
import sm.dsw.ms.usuario.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> findById(Integer usuario_id) {
        return usuarioRepository.findAllById(usuario_id);
    }

}
