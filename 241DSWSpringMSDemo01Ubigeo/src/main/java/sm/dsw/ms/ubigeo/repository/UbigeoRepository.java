/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.ubigeo.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.ubigeo.model.Ubigeo;

/**
 *
 * @author Fabrizio
 */
@Repository
public interface UbigeoRepository extends CrudRepository<Ubigeo, Integer> {
    List<Ubigeo> findAllByubigeoid(Long ubigeoid);
}
