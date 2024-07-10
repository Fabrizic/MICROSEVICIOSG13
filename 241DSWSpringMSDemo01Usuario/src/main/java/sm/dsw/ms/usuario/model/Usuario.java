/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm.dsw.ms.usuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Fabrizio
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    private Persona persona;

    @Column(nullable = false, unique = true, length = 250)
    private String correo;

    @Column(nullable = false, length = 250)
    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "tipousuarioid", referencedColumnName = "tipousuarioid")
    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    public Usuario(Persona persona, String correo, String contrasena, TipoUsuario tipoUsuario) {
        this.persona = persona;
        this.correo = correo;
        this.contrasena = new BCryptPasswordEncoder().encode(contrasena);
        this.tipoUsuario = tipoUsuario;
    }

    // Getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = new BCryptPasswordEncoder().encode(contrasena);
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // Método para verificar la contraseña
    public boolean checkPassword(String password) {
        return new BCryptPasswordEncoder().matches(password, this.contrasena);
    }
}
