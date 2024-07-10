package sm.dsw.ms.persona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;

@Entity
@Table(name = "ubigeo")
public class Ubigeo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ubigeoid;

    @Column(nullable = false, length = 250)
    private String distrito;

    @Column(nullable = false, length = 250)
    private String provincia;

    @Column(nullable = false, length = 250)
    private String departamento;

    @Column(nullable = false)
    private Integer poblacion;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal superficie;

    @Column(nullable = false, precision = 10, scale = 6)
    private BigDecimal y;

    @Column(nullable = false, precision = 10, scale = 6)
    private BigDecimal x;

    // Constructores, getters y setters

    public Ubigeo() {}

    public Ubigeo(String distrito, String provincia, String departamento, Integer poblacion, BigDecimal superficie, BigDecimal y, BigDecimal x) {
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.y = y;
        this.x = x;
    }

    // Getters y setters

    public Long getUbigeoid() {
        return ubigeoid;
    }

    public void setUbigeoid(Long ubigeoid) {
        this.ubigeoid = ubigeoid;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }
}
