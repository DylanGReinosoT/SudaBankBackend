package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T33")
@Getter
@NoArgsConstructor
public class T33Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String sustituida;

    public T33Entity(int id, String codigo, String descripcion, String sustituida) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sustituida = sustituida;
    }
}
