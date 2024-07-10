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
@Table(name = "preguntas")
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer preguntaid;

    @Column(nullable = false)
    private Integer testid; // Se mantiene como un campo regular, no como una relación FK

    @Column(length = 100, nullable = false)
    private String textopregunta;

    @Column(nullable = false)
    private Integer numeropregunta;

    // Constructor vacío necesario para JPA
    public Preguntas() {
    }

    // Constructor con parámetros
    public Preguntas(Integer testid, String textopregunta, Integer numeropregunta) {
        this.testid = testid;
        this.textopregunta = textopregunta;
        this.numeropregunta = numeropregunta;
    }

    // Getters y setters
    public Integer getPreguntaid() {
        return preguntaid;
    }

    public void setPreguntaid(Integer preguntaid) {
        this.preguntaid = preguntaid;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getTextopregunta() {
        return textopregunta;
    }

    public void setTextopregunta(String textopregunta) {
        this.textopregunta = textopregunta;
    }

    public Integer getNumeropregunta() {
        return numeropregunta;
    }

    public void setNumeropregunta(Integer numeropregunta) {
        this.numeropregunta = numeropregunta;
    }
}
