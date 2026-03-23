package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESL06")
public class L06Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION_EMISOR")
    private Integer codigoTipoIdentificacionEmisor;

    @Column(name = "CODIGO_IDENTIFICACION_EMISOR")
    private Integer codigoIdentificacionEmisor;

    @Column(name = "NUMERO_TITULO")
    private Integer numeroTitulo;

    @Column(name = "NUMERO_OPERACION")
    private Integer numeroOperacion;

    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @Column(name = "FECHA_COMPRA")
    private LocalDate fechaCompra;

    @Column(name = "CODIGO_ESTADO_OPERACION")
    private Integer codigoEstadoOperacion;

    @Column(name = "CUENTA_CONTABLE")
    private String cuentaContable;

    @Column(name = "CODIGO_TIPO_OPERACION")
    private Integer codigoTipoOperacion;

    @Column(name = "FECHA_OPERACION")
    private LocalDate fechaOperacion;

    @Column(name = "FECHA_VENCIMIENTO_OPERACION")
    private LocalDate fechaVencimientoOperacion;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION_CONTRAPARTE")
    private Integer codigoTipoIdentificacionContraparte;

    @Column(name = "CODIGO_IDENTIFICACION_CONTRAPARTE_OPERACION")
    private Integer codigoIdentificacionContraparteOperacion;

    @Column(name = "CODIGO_MONEDA_DENOMINACION")
    private Integer codigoMonedaDenominacion;

    @Column(name = "MONTO_NEGOCIADO_DOLARES")
    private BigDecimal montoNegociadoDolares;

    @Column(name = "TASA_EFECTIVA_ANUAL")
    private BigDecimal tasaEfectivaAnual;

    @Column(name = "VALOR_NOMINAL_TITULO_DOLARES")
    private Float valorNominalTituloDolares;

    @Column(name = "VALOR_MERCADO_TITULO_DOLAR")
    private Float valorMercadoTituloDolar;

    @Column(name = "CODIGO_CATEGORIA_CALIFICACION")
    private Integer codigoCategoriaCalificacion;

    @Column(name = "CODIGO_CALIFICACION_RIESGO")
    private Integer codigoCalificacionRiesgo;

    @Column(name = "CODIGO_CALIFICADORA_RIESGO")
    private Integer codigoCalificadoraRiesgo;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION_CUSTODIO")
    private Integer codigoTipoIdentificacionCustodio;

    @Column(name = "CODIGO_IDENTIFICACION_CUSTODIO")
    private Integer codigoIdentificacionCustodio;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacionEmisor() {
        return codigoTipoIdentificacionEmisor;
    }
    public void setCodigoTipoIdentificacionEmisor(Integer codigoTipoIdentificacionEmisor) {
        this.codigoTipoIdentificacionEmisor = codigoTipoIdentificacionEmisor;
    }

    public Integer getCodigoIdentificacionEmisor() {
        return codigoIdentificacionEmisor;
    }
    public void setCodigoIdentificacionEmisor(Integer codigoIdentificacionEmisor){
        this.codigoIdentificacionEmisor = codigoIdentificacionEmisor;
    }

    public Integer getNumeroTitulo(){
        return numeroTitulo;
    }
    public void setNumeroTitulo(Integer numeroTitulo){
        this.numeroTitulo = numeroTitulo;
    }

    public Integer getNumeroOperacion(){
        return numeroOperacion;
    }
    public void setNumeroOperacion(Integer numeroOperacion){
        this.numeroOperacion = numeroOperacion;
    }

    public LocalDate getFechaEmision(){
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision){
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaCompra(){
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra){
        this.fechaCompra = fechaCompra;
    }

    public Integer getCodigoEstadoOperacion(){
        return codigoEstadoOperacion;
    }
    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion){
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public String getCuentaContable(){
        return cuentaContable;
    }
    public void setCuentaContable(String  cuentaContable){
        this.cuentaContable = cuentaContable;
    }

    public Integer getCodigoTipoOperacion(){
        return codigoTipoOperacion;
    }
    public void setCodigoTipoOperacion(Integer codigoTipoOperacion){
        this. codigoTipoOperacion =  codigoTipoOperacion;
    }

    public LocalDate getFechaOperacion(){
        return fechaOperacion;
    }
    public void setFechaOperacion(LocalDate fechaOperacion){
        this.fechaOperacion = fechaOperacion;
    }

    public LocalDate getFechaVencimientoOperacion(){
        return fechaVencimientoOperacion;
    }
    public void setFechaVencimientoOperacion(LocalDate fechaVencimientoOperacion){
        this.fechaVencimientoOperacion = fechaVencimientoOperacion;
    }

    public Integer getCodigoTipoIdentificacionContraparte(){
        return codigoTipoIdentificacionContraparte;
    }
    public void setCodigoTipoIdentificacionContraparte(Integer codigoTipoIdentificacionContraparte){
        this.codigoTipoIdentificacionContraparte = codigoTipoIdentificacionContraparte;
    }

    public Integer getCodigoIdentificacionContraparteOperacion(){
        return codigoIdentificacionContraparteOperacion;
    }
    public void setCodigoIdentificacionContraparteOperacion(Integer codigoIdentificacionContraparteOperacion){
        this.codigoIdentificacionContraparteOperacion = codigoIdentificacionContraparteOperacion;
    }

    public Integer getCodigoMonedaDenominacion(){
        return codigoMonedaDenominacion;
    }
    public void setCodigoMonedaDenominacion(Integer codigoMonedaDenominacion){
        this.codigoMonedaDenominacion = codigoMonedaDenominacion;
    }

    public BigDecimal getMontoNegociadoDolares(){
        return montoNegociadoDolares;
    }
    public void setMontoNegociadoDolares(BigDecimal montoNegociadoDolares){
        this.montoNegociadoDolares =  montoNegociadoDolares;
    }

    public BigDecimal getTasaEfectivaAnual(){
        return tasaEfectivaAnual;
    }
    public void setTasaEfectivaAnual(BigDecimal tasaEfectivaAnual){
        this.tasaEfectivaAnual = tasaEfectivaAnual;
    }

    public Float getValorNominalTituloDolares(){
        return valorNominalTituloDolares;
    }
    public void setValorNominalTituloDolares(Float valorNominalTituloDolares){
        this.valorNominalTituloDolares = valorNominalTituloDolares;
    }

    public Float getValorMercadoTituloDolar(){
        return valorMercadoTituloDolar;
    }
    public void setValorMercadoTituloDolar(Float valorMercadoTituloDolar){
        this.valorMercadoTituloDolar =  valorMercadoTituloDolar;
    }

    public Integer getCodigoCategoriaCalificacion(){
        return codigoCategoriaCalificacion;
    }
    public void setCodigoCategoriaCalificacion(Integer codigoCategoriaCalificacion){
        this.codigoCategoriaCalificacion = codigoCategoriaCalificacion;
    }

    public Integer getCodigoCalificacionRiesgo(){
        return codigoCalificacionRiesgo;
    }
    public void setcodigoCalificacionRiesgo(Integer codigoCalificacionRiesgo){
        this.codigoCalificacionRiesgo = codigoCalificacionRiesgo;
    }

    public Integer getCodigoCalificadoraRiesgo(){
        return codigoCalificadoraRiesgo;
    }
    public void setCodigoCalificadoraRiesgo(Integer codigoCalificadoraRiesgo){
        this.codigoCalificadoraRiesgo = codigoCalificadoraRiesgo;
    }

    public Integer getCodigoTipoIdentificacionCustodio(){
        return codigoTipoIdentificacionCustodio;
    }

    public  Integer getCodigoIdentificacionCustodio() {
        return codigoIdentificacionCustodio;
    }
    public void setCodigoTipoIdentificacionCustodio(Integer codigoTipoIdentificacionCustodio){
        this.codigoTipoIdentificacionCustodio = codigoTipoIdentificacionCustodio;
    }
    public void setCodigoIdentificacionCustodio(Integer codigoIdentificacionCustodio){
        this.codigoIdentificacionCustodio = codigoIdentificacionCustodio;
    }
}
