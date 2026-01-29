package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR08")
public class R08Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "CODIGO_BIEN")
    private String  codigoBien;

    @Column(name = "CODIGO_TIPO_BIEN")
    private Integer codigoTipoBien;

    @Column(name = "DESCRIPCION_BIEN")
    private String  descripcionBien;

    @Column(name = "CODIGO_PAIS")
    private Integer codigoPais;

    @Column(name = "CODIGO_PROVINCIA")
    private Integer codigoProvincia;

    @Column(name = "CODIGO_CANTON")
    private Integer codigoCanton;

    @Column(name = "FECHA_CONTABILIZACION")
    private LocalDate fechaContabilizacion;

    @Column(name = "VALOR_LIBROS", precision = 15, scale = 2)
    private BigDecimal valorLibros;

    @Column(name = "VALOR_ULTIMO_AVALUO", precision = 15, scale = 2)
    private BigDecimal valorUltimoAvaluo;

    @Column(name = "FECHA_ULTIMO_AVALUO")
    private LocalDate fechaUltimoAvaluo;

    @Column(name = "VALOR_PROVISION_CONSTITUIDA", precision = 15, scale = 2)
    private BigDecimal valorProvisionConstituida;

    @Column(name = "FECHA_REALIZACION_BIEN")
    private LocalDate fechaRealizacionBien;

    @Column(name = "VALOR_REALIZACION_BIEN", precision = 15, scale = 2)
    private BigDecimal valorRealizacionBien;

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
