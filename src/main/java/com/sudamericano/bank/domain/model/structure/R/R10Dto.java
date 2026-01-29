package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;

public class R10Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private Integer codigoClaseBienTitulo;
    private String codigoBienTitulo;
    private Integer tipoBienTitulo;
    private BigDecimal provisionConstituida;
    private BigDecimal costosGenerados;
    private Integer tipoTitulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
