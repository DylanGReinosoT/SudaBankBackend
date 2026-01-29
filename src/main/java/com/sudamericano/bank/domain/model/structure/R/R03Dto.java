package com.sudamericano.bank.domain.model.structure.R;

public class R03Dto
{
    private Integer id;

    private Integer CodigoTipoIdentificacion;

    private String IdentificacionSujeto;

    private String NumeroOperacion;

    private String NumeroOperacionAnterior;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return CodigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        CodigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return IdentificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        IdentificacionSujeto = identificacionSujeto;
    }

    public String getNumeroOperacion() {
        return NumeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        NumeroOperacion = numeroOperacion;
    }

    public String getNumeroOperacionAnterior() {
        return NumeroOperacionAnterior;
    }

    public void setNumeroOperacionAnterior(String numeroOperacionAnterior) {
        NumeroOperacionAnterior = numeroOperacionAnterior;
    }
}
