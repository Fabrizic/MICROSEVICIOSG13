package sm.dsw.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.model.Respuestas;
import sm.dsw.ms.repository.RespuestasRepository;
import java.util.List;

@Service
public class RespuestasServiceImpl implements RespuestasService{
    @Autowired
    private RespuestasRepository respuestasRepository;

    @Override
    public List<Respuestas> findAll() {
        return respuestasRepository.findAll();
    }
}
