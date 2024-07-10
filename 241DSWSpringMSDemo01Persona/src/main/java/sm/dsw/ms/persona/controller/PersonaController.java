package sm.dsw.ms.persona.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import sm.dsw.ms.persona.model.Persona;
import sm.dsw.ms.persona.service.PersonaService;
import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> findAll(){
        return ResponseEntity.ok(personaService.findAll());
    }

    @GetMapping("/{personaid}")
    public ResponseEntity<List<Persona>> getPersonaByPersonaId(@PathVariable Integer personaid) {
        List<Persona> persona = personaService.findById(personaid);
        return ResponseEntity.ok().body(persona);
    }

}
