package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T2")
@Getter
@NoArgsConstructor
public class T2Entity {

    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String estado;

    public T2Entity(String estado, String descripcion, String codigo, int id) {
        this.estado = estado;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.id = id;
    }
}
