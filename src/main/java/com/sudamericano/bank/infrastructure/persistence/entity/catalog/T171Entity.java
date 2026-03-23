package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T171")
@Getter
@NoArgsConstructor
public class T171Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;


    public T171Entity(int id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
