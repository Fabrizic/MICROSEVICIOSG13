/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.ubigeo.service;

import java.util.List;
import sm.dsw.ms.ubigeo.model.Ubigeo;

/**
 *
 * @author Fabrizio
 */
public interface UbigeoService {
    List<Ubigeo> findAll();

    Ubigeo findById(Integer ubigeoid);

    Ubigeo save(Ubigeo ubigeo);

    void deleteById(Integer ubigeoid);
    
}
