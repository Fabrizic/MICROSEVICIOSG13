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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "preguntas")
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "preguntaid")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "testid", nullable = false) // Define la columna de clave foránea
    private Test test; // Cambia el tipo de Integer a Test

    @Column(length = 100, nullable = false)
    private String textopregunta;

    @Column(nullable = false)
    private Integer numeropregunta;

    // Constructor vacío necesario para JPA
    public Preguntas() {
    }

    // Constructor con parámetros
    public Preguntas(Test test, String textopregunta, Integer numeropregunta) {
        this.test = test;
        this.textopregunta = textopregunta;
        this.numeropregunta = numeropregunta;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
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