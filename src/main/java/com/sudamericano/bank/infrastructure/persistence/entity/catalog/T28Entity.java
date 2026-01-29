package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T28")
@Getter
@NoArgsConstructor
public class T28Entity {

    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String nivel;

    public T28Entity(String codigo, String descripcion, String nivel) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }
}
