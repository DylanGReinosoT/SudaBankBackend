package com.sudamericano.bank.domain.model.structure.L;

import java.math.BigDecimal;

public class L10Dto {
    private Integer id;
    private String codigoProducto;
    private Integer codigoBanda;
    private BigDecimal valorProductoBanda;

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

    public Integer getCodigoBanda() {
        return codigoBanda;
    }

    public void setCodigoBanda(Integer codigoBanda) {
        this.codigoBanda = codigoBanda;
    }

    public BigDecimal getValorProductoBanda() {
        return valorProductoBanda;
    }

    public void setValorProductoBanda(BigDecimal valorProductoBanda) {
        this.valorProductoBanda = valorProductoBanda;
    }
}
