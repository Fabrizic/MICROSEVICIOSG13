/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sm.dsw.ms.service.TestService;

/**
 *
 * @author Fabrizio
 */
@RestController
@RequestMapping("/api/test")
public class TestController {
    
    @Autowired
    private TestService testService;
    
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(testService.findAll());
    }
    
    
}
