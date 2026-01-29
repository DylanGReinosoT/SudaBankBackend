package com.sudamericano.bank.domain.model.structure.R;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R07Dto {

    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String numeroGarantia;
    private Integer codigoTipoGarantia;
    private String descripcionGarantia;
    private Integer codigoPais;
    private Integer codigoProvincia;
    private Integer codigoCanton;
    private BigDecimal valorAvaluo;
    private String fechaAvaluo;
    private String numeroRegistroGarantia;
    private String fechaContabilizacionGarantia;
    private BigDecimal porcentajeGarantia;
    private Integer estadoRegistro;

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
    
    public String getNumeroGarantia() {
        return numeroGarantia;
    }
    
    public void setNumeroGarantia(String numeroGarantia) {
        this.numeroGarantia = numeroGarantia;
    }
    
    public Integer getCodigoTipoGarantia() {
        return codigoTipoGarantia;
    }
    
    public void setCodigoTipoGarantia(Integer codigoTipoGarantia) {
        this.codigoTipoGarantia = codigoTipoGarantia;
    }
    
    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }
    
    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }
    
    public Integer getCodigoPais() {
        return codigoPais;
    }
    
    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }
    
    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }
    
    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    
    public Integer getCodigoCanton() {
        return codigoCanton;
    }
    
    public void setCodigoCanton(Integer codigoCanton) {
        this.codigoCanton = codigoCanton;
    }
    
    public BigDecimal getValorAvaluo() {
        return valorAvaluo;
    }
    
    public void setValorAvaluo(BigDecimal valorAvaluo) {
        this.valorAvaluo = valorAvaluo;
    }
    
    public String getFechaAvaluo() {
        return fechaAvaluo;
    }
    
    public void setFechaAvaluo(String fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }
    
    public String getNumeroRegistroGarantia() {
        return numeroRegistroGarantia;
    }
    
    public void setNumeroRegistroGarantia(String numeroRegistroGarantia) {
        this.numeroRegistroGarantia = numeroRegistroGarantia;
    }
    
    public String getFechaContabilizacionGarantia() {
        return fechaContabilizacionGarantia;
    }
    
    public void setFechaContabilizacionGarantia(String fechaContabilizacionGarantia) {
        this.fechaContabilizacionGarantia = fechaContabilizacionGarantia;
    }
    
    public BigDecimal getPorcentajeGarantia() {
        return porcentajeGarantia;
    }
    
    public void setPorcentajeGarantia(BigDecimal porcentajeGarantia) {
        this.porcentajeGarantia = porcentajeGarantia;
    }
    
    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }
    
    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
}