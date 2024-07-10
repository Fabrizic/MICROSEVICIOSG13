package sm.dsw.ms.usuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import sm.dsw.ms.usuario.model.Usuario;
import sm.dsw.ms.usuario.service.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    
        @Autowired
        private UsuarioService usuarioService;
    
        @GetMapping("/all")
        public ResponseEntity<List<Usuario>> findAll(){
            return ResponseEntity.ok(usuarioService.findAll());
        }
    
        @GetMapping("/{usuario_id}")
        public ResponseEntity<List<Usuario>> getUsuarioByUsuarioId(@PathVariable Integer usuario_id) {
            List<Usuario> usuario = usuarioService.findById(usuario_id);
            return ResponseEntity.ok().body(usuario);
        }
}
