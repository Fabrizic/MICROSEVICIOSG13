/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.service;

import java.util.List;
import sm.dsw.ms.model.Test;

/**
 *
 * @author Fabrizio
 */
public interface TestService {
    List<Test> findAll();

    Test findById(Integer test_id);

    Test save(Test test);

    void deleteById(Integer test_id);
}
