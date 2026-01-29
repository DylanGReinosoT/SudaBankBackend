package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "T38")
@Getter
@NoArgsConstructor
public class T38Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private String periodicidad;

    public T38Entity(int id, String codigo, String descripcion, String periodicidad) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.periodicidad = periodicidad;
    }
}
