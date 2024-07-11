package sm.dsw.ms.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import sm.dsw.ms.model.Respuestas;

public interface RespuestasRepository extends JpaRepository<Respuestas, Integer>{
    List<Respuestas> findAllById(Integer respuestaid);
}
