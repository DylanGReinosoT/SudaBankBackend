package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

@Entity
@Table(name = "NESL07")
public class L07Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TIPO_IDENTIFICACION_EMISOR")
    private Integer tipoIdentificacionEmisor;

    @Column(name = "IDENTIFICACION_EMISOR")
    private String identificacionEmisor;

    @Column(name = "NACIONALIDAD_EMISOR")
    private Integer nacionalidadEmisor;

    @Column(name = "TIPO_EMISOR")
    private Integer tipoEmisor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTipoIdentificacionEmisor() {
        return tipoIdentificacionEmisor;
    }

    public void setTipoIdentificacionEmisor(Integer tipoIdentificacionEmisor) {
        this.tipoIdentificacionEmisor = tipoIdentificacionEmisor;
    }

    public String getIdentificacionEmisor() {
        return identificacionEmisor;
    }

    public void setIdentificacionEmisor(String identificacionEmisor) {
        this.identificacionEmisor = identificacionEmisor;
    }

    public Integer getNacionalidadEmisor() {
        return nacionalidadEmisor;
    }

    public void setNacionalidadEmisor(Integer nacionalidadEmisor) {
        this.nacionalidadEmisor = nacionalidadEmisor;
    }

    public Integer getTipoEmisor() {
        return tipoEmisor;
    }

    public void setTipoEmisor(Integer tipoEmisor) {
        this.tipoEmisor = tipoEmisor;
    }
}
