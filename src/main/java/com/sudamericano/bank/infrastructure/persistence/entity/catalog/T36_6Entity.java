package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T36_6")
@Getter
@NoArgsConstructor
public class T36_6Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;

    public T36_6Entity(int id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
