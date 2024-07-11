package sm.dsw.ms.service;

import java.util.List;
import sm.dsw.ms.model.Preguntas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.repository.PreguntasRepository;

@Service
public class PreguntasServiceImpl implements PreguntasService{
    @Autowired
    private PreguntasRepository preguntasRepository;

    @Override
    public List<Preguntas> findAll() {
        return preguntasRepository.findAll();
    }

    @Override
    public Preguntas findById(Integer preguntaid) {
        return preguntasRepository.findById(preguntaid).get();
    }

    @Override
    public Preguntas save(Preguntas preguntas) {
        return preguntasRepository.save(preguntas);
    }

    @Override
    public void deleteById(Integer preguntaid) {
        preguntasRepository.deleteById(preguntaid);
    }


}
