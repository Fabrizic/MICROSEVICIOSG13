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
@Table(name = "respuestas")
public class Respuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "respuestaid")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "testid", nullable = false) // Define la columna de clave foránea
    private Test test; // Cambia el tipo de Integer a Test

    @Column(length = 100, nullable = false)
    private String textorespuesta;

    @Column(nullable = false)
    private Integer numerorespuesta;

    // Constructor vacío necesario para JPA
    public Respuestas() {
    }

    // Constructor con parámetros
    public Respuestas(Test test, String textorespuesta, Integer numerorespuesta) {
        this.test = test;
        this.textorespuesta = textorespuesta;
        this.numerorespuesta = numerorespuesta;
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