package sm.dsw.ms.service;

import java.util.List;
import sm.dsw.ms.model.Respuestas;

public interface RespuestasService {
    List<Respuestas> findAll();

    Respuestas findById(Integer id);

    Respuestas save(Respuestas respuestas);

    void deleteById(Integer id);
}
