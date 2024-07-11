package sm.dsw.ms.repository;

import java.util.List;
import sm.dsw.ms.model.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntasRepository extends JpaRepository<Preguntas, Integer>{
    List<Preguntas> findAllById(Integer preguntaid);
}
