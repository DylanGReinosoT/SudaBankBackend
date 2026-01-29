package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R09Dto {
    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String  codigoTituloValor;
    private Integer codigoTipoTitulo;
    private String  descripcionTituloValor;
    private String  nombreEmisor;
    private Integer codigoPaisEmisor;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private BigDecimal valorNominal;
    private LocalDate fechaContabilizacion;
    private BigDecimal valorLibros;
    private BigDecimal valorProvisionConstituida;
    private LocalDate fechaRealizacionTitulo;
    private BigDecimal valorRealizacionTitulo;
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

    public String getCodigoTituloValor() {
        return codigoTituloValor;
    }

    public void setCodigoTituloValor(String codigoTituloValor) {
        this.codigoTituloValor = codigoTituloValor;
    }

    public Integer getCodigoTipoTitulo() {
        return codigoTipoTitulo;
    }

    public void setCodigoTipoTitulo(Integer codigoTipoTitulo) {
        this.codigoTipoTitulo = codigoTipoTitulo;
    }

    public String getDescripcionTituloValor() {
        return descripcionTituloValor;
    }

    public void setDescripcionTituloValor(String descripcionTituloValor) {
        this.descripcionTituloValor = descripcionTituloValor;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public Integer getCodigoPaisEmisor() {
        return codigoPaisEmisor;
    }

    public void setCodigoPaisEmisor(Integer codigoPaisEmisor) {
        this.codigoPaisEmisor = codigoPaisEmisor;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(BigDecimal valorNominal) {
        this.valorNominal = valorNominal;
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

    public BigDecimal getValorProvisionConstituida() {
        return valorProvisionConstituida;
    }

    public void setValorProvisionConstituida(BigDecimal valorProvisionConstituida) {
        this.valorProvisionConstituida = valorProvisionConstituida;
    }

    public LocalDate getFechaRealizacionTitulo() {
        return fechaRealizacionTitulo;
    }

    public void setFechaRealizacionTitulo(LocalDate fechaRealizacionTitulo) {
        this.fechaRealizacionTitulo = fechaRealizacionTitulo;
    }

    public BigDecimal getValorRealizacionTitulo() {
        return valorRealizacionTitulo;
    }

    public void setValorRealizacionTitulo(BigDecimal valorRealizacionTitulo) {
        this.valorRealizacionTitulo = valorRealizacionTitulo;
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
