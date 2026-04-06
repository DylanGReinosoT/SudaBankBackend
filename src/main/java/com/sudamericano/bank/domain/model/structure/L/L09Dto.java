package com.sudamericano.bank.domain.model.structure.L;

public class L09Dto {
    private Integer id;
    private String codigoProducto;
    private String descripcionProducto;
    private Integer codigoFondoInversion;
    private Integer estadoRegistro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Integer getCodigoFondoInversion() {
        return codigoFondoInversion;
    }

    public void setCodigoFondoInversion(Integer codigoFondoInversion) {
        this.codigoFondoInversion = codigoFondoInversion;
    }

    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
}
