package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T7")
@Getter
@NoArgsConstructor
public class T7Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private Integer codigoProv;
    private char estado;

    public T7Entity(int id, String codigo, String descripcion, Integer codigoProv, char estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.codigoProv = codigoProv;
        this.estado = estado;
    }
}
