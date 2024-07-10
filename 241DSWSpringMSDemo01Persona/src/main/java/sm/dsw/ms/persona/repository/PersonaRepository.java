package sm.dsw.ms.persona.repository;

import java.util.List;
import sm.dsw.ms.persona.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    List<Persona> findAllById(Integer id);

    List<Persona> findPersonaById(Integer id);
}
