/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.model;

/**
 *
 * @author Fabrizio
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "respuestas")
public class Respuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer respuestaid;

    @Column(nullable = false)
    private Integer testid; // Se mantiene como un campo regular, no como una relación FK

    @Column(length = 100, nullable = false)
    private String textorespuesta;

    @Column(nullable = false)
    private Integer numerorespuesta;

    // Constructor vacío necesario para JPA
    public Respuestas() {
    }

    // Constructor con parámetros
    public Respuestas(Integer testid, String textorespuesta, Integer numerorespuesta) {
        this.testid = testid;
        this.textorespuesta = textorespuesta;
        this.numerorespuesta = numerorespuesta;
    }

    // Getters y setters
    public Integer getRespuestaid() {
        return respuestaid;
    }

    public void setRespuestaid(Integer respuestaid) {
        this.respuestaid = respuestaid;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getTextorespuesta() {
        return textorespuesta;
    }

    public void setTextorespuesta(String textorespuesta) {
        this.textorespuesta = textorespuesta;
    }

    public Integer getNumerorespuesta() {
        return numerorespuesta;
    }

    public void setNumerorespuesta(Integer numerorespuesta) {
        this.numerorespuesta = numerorespuesta;
    }
}