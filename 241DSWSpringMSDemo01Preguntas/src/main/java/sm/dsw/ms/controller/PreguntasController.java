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

    @GetMapping("/{id}")
    public ResponseEntity<Preguntas> findById(@PathVariable Integer id){
        return ResponseEntity.ok(preguntasService.findById(id));
    }

    @GetMapping("/add")
    public ResponseEntity<Preguntas> addPreguntas(Preguntas preguntas) {
        return ResponseEntity.ok(preguntasService.save(preguntas));
    }

    @GetMapping("/update")
    public ResponseEntity<Preguntas> updatePreguntas(Preguntas preguntas) {
        return ResponseEntity.ok(preguntasService.save(preguntas));
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        preguntasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
