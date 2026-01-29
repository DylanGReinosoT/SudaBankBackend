package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.*;

@Entity
@Table(name = "T59")
public class T59Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Codigo")
    private String codigo;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "FORMA_REPORTE")
    private String formaReporte;

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

    public String getFormaReporte() {
        return formaReporte;
    }

    public void setFormaReporte(String formaReporte) {
        this.formaReporte = formaReporte;
    }
}
