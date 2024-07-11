package sm.dsw.ms.service;

import sm.dsw.ms.model.Preguntas;
import java.util.List;

public interface PreguntasService {
    List<Preguntas> findAll();

    Preguntas findById(Integer preguntaid);

    Preguntas save(Preguntas preguntas);

    void deleteById(Integer preguntaid);

}
