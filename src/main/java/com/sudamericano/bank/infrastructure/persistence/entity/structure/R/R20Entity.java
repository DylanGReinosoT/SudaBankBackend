package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR20")
public class R20Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_TARJETA")
    private String numeroTarjeta;

    @Column(name = "MARCA_TARJETA")
    private Integer marcaTarjeta;

    @Column(name = "CLASE_TARJETA")
    private Integer claseTarjeta;

    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @Column(name = "FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "NUMERO_TARJETAS_ADICIONALES", precision = 4, scale = 0)
    private BigDecimal numeroTarjetasAdicionales;

    @Column(name = "OFICINA")
    private Integer oficina;

    @Column(name = "TIPO_CREDITO")
    private Integer tipoCredito;

    @Column(name = "ESTADO_REGISTRO")
    private Integer estadoRegistro;

    @Column(name = "TOTAL_INGRESOS_SUJETO", precision = 15, scale = 2)
    private BigDecimal totalIngresosSujeto;

    @Column(name = "TOTAL_EGRESOS_SUJETO", precision = 15, scale = 2)
    private BigDecimal totalEgresosSujeto;

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

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getMarcaTarjeta() {
        return marcaTarjeta;
    }

    public void setMarcaTarjeta(Integer marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    public Integer getClaseTarjeta() {
        return claseTarjeta;
    }

    public void setClaseTarjeta(Integer claseTarjeta) {
        this.claseTarjeta = claseTarjeta;
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

    public BigDecimal getNumeroTarjetasAdicionales() {
        return numeroTarjetasAdicionales;
    }

    public void setNumeroTarjetasAdicionales(BigDecimal numeroTarjetasAdicionales) {
        this.numeroTarjetasAdicionales = numeroTarjetasAdicionales;
    }

    public Integer getOficina() {
        return oficina;
    }

    public void setOficina(Integer oficina) {
        this.oficina = oficina;
    }

    public Integer getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(Integer tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public BigDecimal getTotalIngresosSujeto() {
        return totalIngresosSujeto;
    }

    public void setTotalIngresosSujeto(BigDecimal totalIngresosSujeto) {
        this.totalIngresosSujeto = totalIngresosSujeto;
    }

    public BigDecimal getTotalEgresosSujeto() {
        return totalEgresosSujeto;
    }

    public void setTotalEgresosSujeto(BigDecimal totalEgresosSujeto) {
        this.totalEgresosSujeto = totalEgresosSujeto;
    }
}
