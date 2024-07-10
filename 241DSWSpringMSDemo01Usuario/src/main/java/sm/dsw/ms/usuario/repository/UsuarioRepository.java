package sm.dsw.ms.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sm.dsw.ms.usuario.model.Usuario;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    List<Usuario> findAllById(Integer id);

    List<Usuario> findUsuarioById(Integer id);
}
