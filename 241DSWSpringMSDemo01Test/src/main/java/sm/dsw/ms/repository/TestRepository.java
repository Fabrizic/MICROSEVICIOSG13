/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sm.dsw.ms.model.Test;

/**
 *
 * @author Fabrizio
 */
public interface TestRepository extends CrudRepository<Test, Integer>{
    List<Test> findAllById(Long testid);
}
