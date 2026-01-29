package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T5")
@Getter
@NoArgsConstructor
public class T5Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String estado;

    public T5Entity(int id, String codigo, String descripcion, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
