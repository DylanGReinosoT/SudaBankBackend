package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR07")
public class R07Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO", length = 13)
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION", length = 32)
    private String numeroOperacion;

    @Column(name = "NUMERO_GARANTIA", length = 32)
    private String numeroGarantia;

    @Column(name = "CODIGO_TIPO_GARANTIA")
    private Integer codigoTipoGarantia;

    @Column(name = "DESCRIPCION_GARANTIA", length = 120)
    private String descripcionGarantia;

    @Column(name = "CODIGO_PAIS")
    private Integer codigoPais;

    @Column(name = "CODIGO_PROVINCIA")
    private Integer codigoProvincia;

    @Column(name = "CODIGO_CANTON")
    private Integer codigoCanton;

    @Column(name = "VALOR_AVALUO", precision = 15, scale = 2)
    private BigDecimal valorAvaluo;

    @Column(name = "FECHA_AVALUO")
    private String fechaAvaluo;

    @Column(name = "NUMERO_REGISTRO_GARANTIA", length = 20)
    private String numeroRegistroGarantia;

    @Column(name = "FECHA_CONTABILIZACION_GARANTIA")
    private String fechaContabilizacionGarantia;

    @Column(name = "PORCENTAJE_GARANTIA", precision = 5, scale = 2)
    private BigDecimal porcentajeGarantia;

    @Column(name = "CODIGO_ESTADO_REGISTRO")
    private Integer estadoRegistro;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public void setNumeroGarantia(String numeroGarantia) {
        this.numeroGarantia = numeroGarantia;
    }
    public void setCodigoTipoGarantia(Integer codigoTipoGarantia) {
        this.codigoTipoGarantia = codigoTipoGarantia;
    }
    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }
    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }
    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    public void setCodigoCanton(Integer codigoCanton) {
        this.codigoCanton = codigoCanton;
    }
    public void setValorAvaluo(BigDecimal valorAvaluo) {
        this.valorAvaluo = valorAvaluo;
    }
    public void setFechaAvaluo(String fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }
    public void setNumeroRegistroGarantia(String numeroRegistroGarantia) {
        this.numeroRegistroGarantia = numeroRegistroGarantia;
    }
    public void setFechaContabilizacionGarantia(String fechaContabilizacionGarantia) {
        this.fechaContabilizacionGarantia = fechaContabilizacionGarantia;
    }
    public void setPorcentajeGarantia(BigDecimal porcentajeGarantia) {
        this.porcentajeGarantia = porcentajeGarantia;
    }
    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public Long getId() {
        return id;
    }
    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }
    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }
    public String getNumeroOperacion() {
        return numeroOperacion;
    }
    public String getNumeroGarantia() {
        return numeroGarantia;
    }
    public Integer getCodigoTipoGarantia() {
        return codigoTipoGarantia;
    }
    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }
    public Integer getCodigoPais() {
        return codigoPais;
    }
    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }
    public Integer getCodigoCanton() {
        return codigoCanton;
    }
    public BigDecimal getValorAvaluo() {
        return valorAvaluo;
    }
    public String getFechaAvaluo() {
        return fechaAvaluo;
    }
    public String getNumeroRegistroGarantia() {
        return numeroRegistroGarantia;
    }
    public String getFechaContabilizacionGarantia() {
        return fechaContabilizacionGarantia;
    }
    public BigDecimal getPorcentajeGarantia() {
        return porcentajeGarantia;
    }
    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }
}