package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR13")
public class R13Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_GRUPO_ECONOMICO")
    private String codigoGrupoEconomico;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_INTEGRANTE")
    private String identificacionIntegrante;

    @Column(name = "CODIGO_ESTADO_INTEGRANTE")
    private Integer codigoEstadoIntegrante;

    @Column(name = "FECHA_ESTADO_INTEGRANTE")
    private LocalDate fechaEstadoIntegrante;

    @Column(name = "FACTOR_INTEGRACION")
    private Integer factorIntegracion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoGrupoEconomico() {
        return codigoGrupoEconomico;
    }

    public void setCodigoGrupoEconomico(String codigoGrupoEconomico) {
        this.codigoGrupoEconomico = codigoGrupoEconomico;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionIntegrante() {
        return identificacionIntegrante;
    }

    public void setIdentificacionIntegrante(String identificacionIntegrante) {
        this.identificacionIntegrante = identificacionIntegrante;
    }

    public Integer getCodigoEstadoIntegrante() {
        return codigoEstadoIntegrante;
    }

    public void setCodigoEstadoIntegrante(Integer codigoEstadoIntegrante) {
        this.codigoEstadoIntegrante = codigoEstadoIntegrante;
    }

    public LocalDate getFechaEstadoIntegrante() {
        return fechaEstadoIntegrante;
    }

    public void setFechaEstadoIntegrante(LocalDate fechaEstadoIntegrante) {
        this.fechaEstadoIntegrante = fechaEstadoIntegrante;
    }

    public Integer getFactorIntegracion() {
        return factorIntegracion;
    }

    public void setFactorIntegracion(Integer factorIntegracion) {
        this.factorIntegracion = factorIntegracion;
    }
}
