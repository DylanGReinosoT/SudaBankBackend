package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "NESR05")
public class R05Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "CODIGO_TIPO_TRANSACCION")
    private Integer codigoTipoTransaccion;

    @Column(name = "FECHA_CANCELACION")
    private LocalDate fechaCancelacion;

    @Column(name = "CODIGO_FORMA_CANCELACION")
    private Integer codigoFormaCancelacion;

    @Column(name = "CODIGO_CALIFICACION")
    private Integer codigoCalificacion;

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

    public Integer getCodigoTipoTransaccion() {
        return codigoTipoTransaccion;
    }

    public void setCodigoTipoTransaccion(Integer codigoTipoTransaccion) {
        this.codigoTipoTransaccion = codigoTipoTransaccion;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Integer getCodigoFormaCancelacion() {
        return codigoFormaCancelacion;
    }

    public void setCodigoFormaCancelacion(Integer codigoFormaCancelacion) {
        this.codigoFormaCancelacion = codigoFormaCancelacion;
    }

    public Integer getCodigoCalificacion() {
        return codigoCalificacion;
    }

    public void setCodigoCalificacion(Integer codigoCalificacion) {
        this.codigoCalificacion = codigoCalificacion;
    }
}
