package sm.dsw.ms.persona.service;

import java.util.List;
import sm.dsw.ms.persona.model.Persona;


public interface PersonaService {
    List<Persona> findAll();

    List<Persona> findById(Integer persona_id);
}
