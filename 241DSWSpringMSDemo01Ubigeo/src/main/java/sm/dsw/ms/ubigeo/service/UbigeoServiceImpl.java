/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.ubigeo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import sm.dsw.ms.ubigeo.model.Ubigeo;
import sm.dsw.ms.ubigeo.repository.UbigeoRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabrizio
 */

@Service
public class UbigeoServiceImpl implements UbigeoService{
    
    @Autowired
    UbigeoRepository ubigeoRepository;
    
    @Override
    public List<Ubigeo> findAll() {
        return (List<Ubigeo>) ubigeoRepository.findAll();
    }
    
}
