package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T3")
@Getter
@NoArgsConstructor
public class T3Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String tipo;

    @Column(name = "CODIGO_PARRROQUIA")
    private Integer codigoParrroquia;

    private String direccion;
    private String telefono;
    private Integer estado;

    public T3Entity(int id, String codigo, String descripcion, String tipo, Integer codigoParrroquia, String direccion, String telefono, Integer estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.codigoParrroquia = codigoParrroquia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }
}
