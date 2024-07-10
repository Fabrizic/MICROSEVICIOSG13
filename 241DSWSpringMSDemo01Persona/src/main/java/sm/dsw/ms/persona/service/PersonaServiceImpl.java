package sm.dsw.ms.persona.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.persona.model.Persona;
import sm.dsw.ms.persona.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public List<Persona> findById(Integer persona_id) {
        return personaRepository.findAllById(persona_id);
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deleteById(Integer persona_id) {
        personaRepository.deleteById(persona_id);
    }

}
