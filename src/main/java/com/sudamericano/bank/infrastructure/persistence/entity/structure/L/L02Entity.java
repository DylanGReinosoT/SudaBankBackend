package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESL02")
public class L02Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CODIGO_TIPO_IDENTIFICACION")
	private Integer codigoTipoIdentificacion;

	@Column(name = "CODIGO_EMISOR")
	private Integer codigoEmisor;

	@Column(name = "NUMERO_TITULO",  length = 20)
	private String numeroTitulo;

	@Column(name = "FECHA_EMISION")
	private LocalDate fechaEmision;

	@Column(name = "FECHA_COMPRA")
	private LocalDate fechaCompra;

    @Column(name = "FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "CODIGO_IDENTIFICADOR_INSTRUMENTO")
    private Integer codigoIdentificadorInstrumento;

    @Column(name = "IDENTIFICACION_INSTRUMENTO")
    private String identificacionInstrumento;

    @Column(name = "CODIGO_CATEGORIA_INSTRUMENTO")
    private Integer codigoCategoriaInstrumento;

    @Column(name = "CODIGO_TIPO_INSTRUMENTO")
    private Integer codigoTipoInstrumento;

    @Column(name = "CODIGO_OPCIONALIDAD")
    private Integer codigoOpcionalidad;

    @Column(name = "CODIGO_TASA_BASE")
    private Integer codigoTasaBase;

    @Column(name = "DIFERENCIAL_REVISION")
    private Integer diferencialRevision;

    @Column(name = "CODIGO_TIPO_TASA")
    private Integer codigoTipoTasa;

    @Column(name = "CODIGO_MONEDA_DENOMINACION")
    private Integer codigoMonedaDenominacion;

    @Column(name = "UNIDADES_ADQUIRIDAS")
    private Integer unidadesAdquiridas;

    @Column(name = "VALOR_NOMINAL_DENOMINACION")
    private Float valorNominalDenominacion;

    @Column(name = "VALOR_NOMINAL_DOLARES")
    private Float valorNominalDolares;

    @Column(name = "PRECIO_COMPRA")
    private Float precioCompra;

    @Column(name = "VALOR_COMPRA_DENOMINACION")
    private Float valorCompraDenominacion;

    @Column(name = "VALOR_COMPRA_DOLARES")
    private Float valorCompraDolares;

    @Column(name = "FRECUENCIA_REVISION")
    private Integer frecuenciaRevision;

    @Column(name = "PERIODICIDAD_PAGO")
    private Integer periodicidadPago;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public void setCodigoEmisor(Integer codigoEmisor) {
        this.codigoEmisor = codigoEmisor;
    }

    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;}

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;}

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;}

    public void setCodigoIdentificadorInstrumento(Integer codigoIdentificadorInstrumento) {
        this.codigoIdentificadorInstrumento = codigoIdentificadorInstrumento;}

    public void setIdentificacionInstrumento(String identificacionInstrumento) {
        this.identificacionInstrumento = identificacionInstrumento;}

    public void setCodigoCategoriaInstrumento(Integer codigoCategoriaInstrumento) {
        this.codigoCategoriaInstrumento = codigoCategoriaInstrumento;}

    public void setCodigoTipoInstrumento(Integer codigoTipoInstrumento) {
        this.codigoTipoInstrumento = codigoTipoInstrumento;}

    public void setCodigoOpcionalidad(Integer codigoOpcionalidad) {
        this.codigoOpcionalidad = codigoOpcionalidad;}

    public void setCodigoTasaBase(Integer codigoTasaBase) {
        this.codigoTasaBase = codigoTasaBase;}

    public void setDiferencialRevision(Integer diferencialRevision) {
        this.diferencialRevision = diferencialRevision;}

    public void setCodigoTipoTasa(Integer codigoTipoTasa) {
        this.codigoTipoTasa = codigoTipoTasa;}

    public void setCodigoMonedaDenominacion(Integer codigoMonedaDenominacion) {
        this.codigoMonedaDenominacion = codigoMonedaDenominacion;}

    public void setUnidadesAdquiridas(Integer unidadesAdquiridas) {
        this.unidadesAdquiridas = unidadesAdquiridas;}

    public void setValorNominalDenominacion(Float valorNominalDenominacion) {
        this.valorNominalDenominacion = valorNominalDenominacion;}

    public void setValorNominalDolares(Float valorNominalDolares) {
        this.valorNominalDolares = valorNominalDolares;}

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;}

    public void setValorCompraDenominacion(Float valorCompraDenominacion) {
        this.valorCompraDenominacion = valorCompraDenominacion;}

    public void setValorCompraDolares(Float valorCompraDolares) {
        this.valorCompraDolares = valorCompraDolares;}

    public void setFrecuenciaRevision(Integer frecuenciaRevision) {
        this.frecuenciaRevision = frecuenciaRevision;}

    public void setPeriodicidadPago(Integer periodicidadPago) {
        this.periodicidadPago = periodicidadPago;}


    public Long getId() {
        return id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public Integer getCodigoEmisor() {
        return codigoEmisor;
    }

    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Integer getCodigoIdentificadorInstrumento() {
        return codigoIdentificadorInstrumento;
    }

    public String getIdentificacionInstrumento() {
        return identificacionInstrumento;
    }

    public Integer getCodigoCategoriaInstrumento() {
        return codigoCategoriaInstrumento;
    }

    public Integer getCodigoTipoInstrumento() {
        return codigoTipoInstrumento;
    }

    public Integer getCodigoOpcionalidad() {
        return codigoOpcionalidad;
    }

    public Integer getCodigoTasaBase() {
        return codigoTasaBase;
    }

    public Integer getDiferencialRevision() {
        return diferencialRevision;
    }

    public Integer getCodigoTipoTasa() {
        return codigoTipoTasa;
    }

    public Integer getCodigoMonedaDenominacion() {
        return codigoMonedaDenominacion;
    }

    public Integer getUnidadesAdquiridas() {
        return unidadesAdquiridas;
    }

    public Float getValorNominalDenominacion() {
        return valorNominalDenominacion;
    }

    public Float getValorNominalDolares() {
        return valorNominalDolares;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public Float getValorCompraDenominacion() {
        return valorCompraDenominacion;
    }

    public Float getValorCompraDolares() {
        return valorCompraDolares;
    }

    public Integer getFrecuenciaRevision() {
        return frecuenciaRevision;
    }

    public Integer getPeriodicidadPago() {
        return periodicidadPago;
    }
}
