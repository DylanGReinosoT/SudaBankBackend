package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "NESL10")
public class L10Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_PRODUCTO")
    private String codigoProducto;

    @Column(name = "CODIGO_BANDA")
    private Integer codigoBanda;

    @Column(name = "VALOR_PRODUCTO_BANDA", precision = 15, scale = 4)
    private BigDecimal valorProductoBanda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
