package sm.dsw.ms.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import sm.dsw.ms.model.Preguntas;
import sm.dsw.ms.service.PreguntasService;
import java.util.List;

@RestController
@RequestMapping("/api/preguntas")
public class PreguntasController {
    @Autowired
    private PreguntasService preguntasService;

    @GetMapping("/all")
    public ResponseEntity<List<Preguntas>> findAll(){
        return ResponseEntity.ok(preguntasService.findAll());
    }

    @GetMapping("/preguntas/{preguntaid}")
    public ResponseEntity<List<Preguntas>> getPreguntasByPreguntaId(@PathVariable Integer preguntaid) {
        List<Preguntas> preguntas = preguntasService.findBypreguntaid(preguntaid);
        return ResponseEntity.ok().body(preguntas);
    }
}
