package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

@Entity
@Table(name = "NESL09")
public class L09Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_PRODUCTO")
    private String codigoProducto;

    @Column(name = "DESCRIPCION_PRODUCTO")
    private String descripcionProducto;

    @Column(name = "CODIGO_FONDO_INVERSION")
    private Integer codigoFondoInversion;

    @Column(name = "ESTADO_REGISTRO")
    private Integer estadoRegistro;

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
