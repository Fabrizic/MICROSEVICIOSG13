/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.ubigeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sm.dsw.ms.ubigeo.model.Ubigeo;
import sm.dsw.ms.ubigeo.service.UbigeoService;

/**
 *
 * @author Fabrizio
 */
@RestController
@RequestMapping("/api/ubigeo")
public class UbigeoController {
    
    @Autowired
    private UbigeoService ubigeoService;
    
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(ubigeoService.findAll());
    }
    
    @GetMapping("/{ubigeoid}")
    public ResponseEntity<Ubigeo> getUbigeoById(@PathVariable Integer ubigeoid) {
        Ubigeo ubigeo = ubigeoService.findById(ubigeoid);
        return ResponseEntity.ok().body(ubigeo);
    }

    @PostMapping("/add")
    public ResponseEntity<Ubigeo> addUbigeo(@RequestBody Ubigeo ubigeo) {
        return ResponseEntity.ok(ubigeoService.save(ubigeo));
    }

    @PutMapping("/update")
    public ResponseEntity<Ubigeo> updateUbigeo(@RequestBody Ubigeo ubigeo) {
        return ResponseEntity.ok(ubigeoService.save(ubigeo));
    }

    @DeleteMapping("/delete/{ubigeoid}")
    public ResponseEntity<?> deleteUbigeo(@PathVariable Integer ubigeoid) {
        ubigeoService.deleteById(ubigeoid);
        return ResponseEntity.ok().build();
    }
}
