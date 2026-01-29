package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "NESR10")
public class R10Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "CODIGO_CLASE_BIEN_TITULO")
    private Integer codigoClaseBienTitulo;

    @Column(name = "CODIGO_BIEN_TITULO")
    private String codigoBienTitulo;

    @Column(name = "TIPO_BIEN_TITULO")
    private Integer tipoBienTitulo; // Tabla 41

    @Column(name = "PROVISION_CONSTITUIDA", precision = 15, scale = 2)
    private BigDecimal provisionConstituida;

    @Column(name = "COSTOS_GENERADOS", precision = 15, scale = 2)
    private BigDecimal costosGenerados;

    @Column(name = "TIPO_TITULO")
    private Integer tipoTitulo; // Tabla 41_A

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public Integer getCodigoClaseBienTitulo() {
        return codigoClaseBienTitulo;
    }

    public void setCodigoClaseBienTitulo(Integer codigoClaseBienTitulo) {
        this.codigoClaseBienTitulo = codigoClaseBienTitulo;
    }

    public String getCodigoBienTitulo() {
        return codigoBienTitulo;
    }

    public void setCodigoBienTitulo(String codigoBienTitulo) {
        this.codigoBienTitulo = codigoBienTitulo;
    }

    public Integer getTipoBienTitulo() {
        return tipoBienTitulo;
    }

    public void setTipoBienTitulo(Integer tipoBienTitulo) {
        this.tipoBienTitulo = tipoBienTitulo;
    }

    public BigDecimal getProvisionConstituida() {
        return provisionConstituida;
    }

    public void setProvisionConstituida(BigDecimal provisionConstituida) {
        this.provisionConstituida = provisionConstituida;
    }

    public BigDecimal getCostosGenerados() {
        return costosGenerados;
    }

    public void setCostosGenerados(BigDecimal costosGenerados) {
        this.costosGenerados = costosGenerados;
    }

    public Integer getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(Integer tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }
}
