/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.model.Test;
import sm.dsw.ms.repository.TestRepository;

/**
 *
 * @author Fabrizio
 */
@Service
public class TestServiceImpl implements TestService{
    
    @Autowired
    TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        return (List<Test>) testRepository.findAll();
    }
    
}
