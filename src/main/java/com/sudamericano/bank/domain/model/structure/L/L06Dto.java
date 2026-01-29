package com.sudamericano.bank.domain.model.structure.L;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.time.LocalDate;

public class L06Dto {

    private Long id;
    private Integer codigoTipoIdentificacionEmisor;
    private Integer codigoIdentificacionEmisor;
    private Integer numeroTitulo;
    private Integer numeroOperacion;
    private LocalDate fechaEmision;
    private LocalDate fechaCompra;
    private Integer codigoEstadoOperacion;
    private String cuentaContable;
    private Integer codigoTipoOperacion;
    private LocalDate fechaOperacion;
    private LocalDate fechaVencimientoOperacion;
    private Integer codigoTipoIdentificacionContraparte;
    private Integer codigoIdentificacionContraparteOperacion;
    private Integer codigoMonedaDenominacion;
    private BigDecimal montoNegociadoDolares;
    private BigDecimal tasaEfectivaAnual;
    private Float valorNominalTituloDolares;
    private Float valorMercadoTituloDolar;
    private Integer codigoCategoriaCalificacion;
    private Integer codigoCalificacionRiesgo;
    private Integer codigoCalificadoraRiesgo;
    private String codigoTipoIdentificacionCustodio;
    private String codigoIdentificacionCustodio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setCodigoIdentificacionEmisor(Integer codigoIdentificacionEmisor) {
        this.codigoIdentificacionEmisor = codigoIdentificacionEmisor;
    }

    public Integer getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(Integer numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public Integer getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(Integer numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }
    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }
    public String getCuentaContable() {
        return cuentaContable;
    }
    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }
    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }
    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }
    public LocalDate getFechaOperacion() {
        return fechaOperacion;
    }
    public void setFechaOperacion(LocalDate fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }
    public LocalDate getFechaVencimientoOperacion() {
        return fechaVencimientoOperacion;
    }
    public void setFechaVencimientoOperacion(LocalDate fechaVencimientoOperacion) {
        this.fechaVencimientoOperacion = fechaVencimientoOperacion;
    }
    public Integer getCodigoTipoIdentificacionContraparte(){
        return codigoTipoIdentificacionContraparte;
    }
    public void setCodigoTipoIdentificacionContraparte( Integer codigoTipoIdentificacionContraparte){
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
    public void setCodigoMonedaDenominacion( Integer codigoMonedaDenominacion){
        this.codigoMonedaDenominacion = codigoMonedaDenominacion;
    }
    public BigDecimal getMontoNegociadoDolares(){
        return montoNegociadoDolares;
    }
    public void setMontoNegociadoDolares(BigDecimal montoNegociadoDolares){
        this.montoNegociadoDolares = montoNegociadoDolares;
    }

    public BigDecimal getTasaEfectivaAnual(){
        return  tasaEfectivaAnual;
    }

    public void setTasaEfectivaAnual(BigDecimal  tasaEfectivaAnual){
        this.tasaEfectivaAnual =  tasaEfectivaAnual;
    }

    public Float getValorNominalTituloDolares() {
        return valorNominalTituloDolares;
    }

    public void setvalorNominalTituloDolares(Float valorNominalTituloDolares){
        this.valorNominalTituloDolares =valorNominalTituloDolares;
    }

    public Float getValorMercadoTituloDolar(){
        return valorMercadoTituloDolar;
    }

    public void setValorMercadoTituloDolar(Float valorMercadoTituloDolar){
        this.valorMercadoTituloDolar = valorMercadoTituloDolar;
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
    public void setCodigoCalificacionRiesgo(Integer codigoCalificacionRiesgo){
        this.codigoCalificacionRiesgo = codigoCalificacionRiesgo;
    }
    public Integer getCodigoCalificadoraRiesgo(){
        return codigoCalificadoraRiesgo;
    }
    public void  setCodigoCalificadoraRiesgo(Integer codigoCalificadoraRiesgo){
        this.codigoCalificadoraRiesgo = codigoCalificadoraRiesgo;
    }
    public String getCodigoTipoIdentificacionCustodio(){
        return codigoTipoIdentificacionCustodio;
    }
    public void setCodigoTipoIdentificacionCustodio(String codigoTipoIdentificacionCustodio){
        this.codigoTipoIdentificacionCustodio = codigoTipoIdentificacionCustodio;
    }
    public String getCodigoIdentificacionCustodio(){
        return codigoIdentificacionCustodio;
    }
    public void setCodigoIdentificacionCustodio(){
        this.codigoIdentificacionCustodio = codigoIdentificacionCustodio;
    }



}



