package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR09")
public class R09Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "CODIGO_TITULO_VALOR")
    private String  codigoTituloValor;

    @Column(name = "CODIGO_TIPO_TITULO")
    private Integer codigoTipoTitulo;

    @Column(name = "DESCRIPCION_TITULO_VALOR")
    private String  descripcionTituloValor;

    @Column(name = "NOMBRE_EMISOR")
    private String  nombreEmisor;

    @Column(name = "CODIGO_PAIS_EMISOR")
    private Integer codigoPaisEmisor;

    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @Column(name = "FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "VALOR_NOMINAL", precision = 15, scale = 2)
    private BigDecimal valorNominal;

    @Column(name = "FECHA_CONTABILIZACION")
    private LocalDate fechaContabilizacion;

    @Column(name = "VALOR_LIBROS", precision = 15, scale = 2)
    private BigDecimal valorLibros;

    @Column(name = "VALOR_PROVISION_CONSTITUIDA", precision = 15, scale = 2)
    private BigDecimal valorProvisionConstituida;

    @Column(name = "FECHA_REALIZACION_TITULO")
    private LocalDate fechaRealizacionTitulo;

    @Column(name = "VALOR_REALIZACION_TITULO", precision = 15, scale = 2)
    private BigDecimal valorRealizacionTitulo;

    @Column(name = "CODIGO_ESTADO_REGISTRO")
    private Integer codigoEstadoRegistro;

    @Column(name = "CUSTODIO_EXTERNO")
    private String  custodioExterno;

    @Column(name = "NUMERO_PROCESO_SUBASTA")
    private String  numeroProcesoSubasta;

    @Column(name = "FECHA_PRIMERA_SUBASTA")
    private LocalDate fechaPrimeraSubasta;

    @Column(name = "FECHA_SEGUNDA_SUBASTA")
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
