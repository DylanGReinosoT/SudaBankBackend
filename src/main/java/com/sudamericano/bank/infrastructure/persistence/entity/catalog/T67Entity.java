package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.*;

@Entity
@Table(name = "T67")
public class T67Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "CUENTA_INIFIS")
    private String cuentaInifis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCuentaInifis() {
        return cuentaInifis;
    }

    public void setCuentaInifis(String cuentaInifis) {
        this.cuentaInifis = cuentaInifis;
    }
}
