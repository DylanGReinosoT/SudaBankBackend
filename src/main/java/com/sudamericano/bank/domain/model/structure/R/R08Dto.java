package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R08Dto {
    private Long id;

    private Integer codigoTipoIdentificacion;

    private String identificacionSujeto;

    private String numeroOperacion;

    private String  codigoBien;

    private Integer codigoTipoBien;

    private String  descripcionBien;

    private Integer codigoPais;

    private Integer codigoProvincia;

    private Integer codigoCanton;

    private LocalDate fechaContabilizacion;

    private BigDecimal valorLibros;

    private BigDecimal valorUltimoAvaluo;

    private LocalDate fechaUltimoAvaluo;

    private BigDecimal valorProvisionConstituida;

    private LocalDate fechaRealizacionBien;

    private BigDecimal valorRealizacionBien;

    private Integer codigoEstadoRegistro;

    private String  custodioExterno;

    private String  numeroProcesoSubasta;

    private LocalDate fechaPrimeraSubasta;

    private LocalDate fechaSegundaSubasta;

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

    public String getCodigoBien() {
        return codigoBien;
    }

    public void setCodigoBien(String codigoBien) {
        this.codigoBien = codigoBien;
    }

    public Integer getCodigoTipoBien() {
        return codigoTipoBien;
    }

    public void setCodigoTipoBien(Integer codigoTipoBien) {
        this.codigoTipoBien = codigoTipoBien;
    }

    public String getDescripcionBien() {
        return descripcionBien;
    }

    public void setDescripcionBien(String descripcionBien) {
        this.descripcionBien = descripcionBien;
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

    public LocalDate getFechaContabilizacion() {
        return fechaContabilizacion;
    }

    public void setFechaContabilizacion(LocalDate fechaContabilizacion) {
        this.fechaContabilizacion = fechaContabilizacion;
    }

    public BigDecimal getValorLibros() {
        return valorLibros;
    }

    public void setValorLibros(BigDecimal valorLibros) {
        this.valorLibros = valorLibros;
    }

    public BigDecimal getValorUltimoAvaluo() {
        return valorUltimoAvaluo;
    }

    public void setValorUltimoAvaluo(BigDecimal valorUltimoAvaluo) {
        this.valorUltimoAvaluo = valorUltimoAvaluo;
    }

    public LocalDate getFechaUltimoAvaluo() {
        return fechaUltimoAvaluo;
    }

    public void setFechaUltimoAvaluo(LocalDate fechaUltimoAvaluo) {
        this.fechaUltimoAvaluo = fechaUltimoAvaluo;
    }

    public BigDecimal getValorProvisionConstituida() {
        return valorProvisionConstituida;
    }

    public void setValorProvisionConstituida(BigDecimal valorProvisionConstituida) {
        this.valorProvisionConstituida = valorProvisionConstituida;
    }

    public LocalDate getFechaRealizacionBien() {
        return fechaRealizacionBien;
    }

    public void setFechaRealizacionBien(LocalDate fechaRealizacionBien) {
        this.fechaRealizacionBien = fechaRealizacionBien;
    }

    public BigDecimal getValorRealizacionBien() {
        return valorRealizacionBien;
    }

    public void setValorRealizacionBien(BigDecimal valorRealizacionBien) {
        this.valorRealizacionBien = valorRealizacionBien;
    }

    public Integer getCodigoEstadoRegistro() {
        return codigoEstadoRegistro;
    }

    public void setCodigoEstadoRegistro(Integer codigoEstadoRegistro) {
        this.codigoEstadoRegistro = codigoEstadoRegistro;
    }

    public String getCustodioExterno() {
        return custodioExterno;
    }

    public void setCustodioExterno(String custodioExterno) {
        this.custodioExterno = custodioExterno;
    }

    public String getNumeroProcesoSubasta() {
        return numeroProcesoSubasta;
    }

    public void setNumeroProcesoSubasta(String numeroProcesoSubasta) {
        this.numeroProcesoSubasta = numeroProcesoSubasta;
    }

    public LocalDate getFechaPrimeraSubasta() {
        return fechaPrimeraSubasta;
    }

    public void setFechaPrimeraSubasta(LocalDate fechaPrimeraSubasta) {
        this.fechaPrimeraSubasta = fechaPrimeraSubasta;
    }

    public LocalDate getFechaSegundaSubasta() {
        return fechaSegundaSubasta;
    }

    public void setFechaSegundaSubasta(LocalDate fechaSegundaSubasta) {
        this.fechaSegundaSubasta = fechaSegundaSubasta;
    }
}
