package sm.dsw.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sm.dsw.ms.model.Respuestas;
import sm.dsw.ms.service.RespuestasService;
import java.util.List;

@RestController
@RequestMapping("/api/respuestas")
public class RespuestasController {
    @Autowired
    private RespuestasService respuestasService;

    @GetMapping("/all")
    public ResponseEntity<List<Respuestas>> findAll(){
        return ResponseEntity.ok(respuestasService.findAll());
    }

    @GetMapping("/${id}")
    public ResponseEntity<Respuestas> findById(Integer id){
        return ResponseEntity.ok(respuestasService.findById(id));
    }

    @GetMapping("/add")
    public ResponseEntity<Respuestas> add(Respuestas respuestas){
        return ResponseEntity.ok(respuestasService.save(respuestas));
    }

    @GetMapping("/update")
    public ResponseEntity<Respuestas> update(Respuestas respuestas){
        return ResponseEntity.ok(respuestasService.save(respuestas));
    }

    @GetMapping("/delete/${id}")
    public ResponseEntity<?> deleteById(Integer id){
        respuestasService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
