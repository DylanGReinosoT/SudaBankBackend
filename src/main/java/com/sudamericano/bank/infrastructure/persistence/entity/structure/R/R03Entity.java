package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

@Entity
@Table(name = "NESR03")
public class R03Entity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer CodigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String IdentificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String NumeroOperacion;

    @Column(name = "NUMERO_OPERACION_ANTERIOR")
    private String NumeroOperacionAnterior;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
