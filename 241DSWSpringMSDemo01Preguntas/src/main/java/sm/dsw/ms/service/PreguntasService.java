package sm.dsw.ms.service;

import sm.dsw.ms.model.Preguntas;
import java.util.List;

public interface PreguntasService {
    List<Preguntas> findAll();

    List<Preguntas> findBypreguntaid(Integer preguntaid);
}
