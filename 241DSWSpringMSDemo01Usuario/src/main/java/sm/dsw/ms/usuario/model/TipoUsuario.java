/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.usuario.model;

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
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipousuarioid")
    private Integer tipousuarioid;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    public TipoUsuario() {
    }

    public TipoUsuario(String descripcion) {
        this.descripcion = descripcion;
    }
}
