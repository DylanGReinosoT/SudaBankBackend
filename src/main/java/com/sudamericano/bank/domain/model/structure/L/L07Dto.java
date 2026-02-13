package com.sudamericano.bank.domain.model.structure.L;

public class L07Dto {
    private Integer id;
    private Integer tipoIdentificacionEmisor;
    private String identificacionEmisor;
    private Integer nacionalidadEmisor;
    private Integer tipoEmisor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
