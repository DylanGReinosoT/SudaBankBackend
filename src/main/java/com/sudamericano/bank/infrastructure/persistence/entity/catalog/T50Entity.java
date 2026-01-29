package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T50")
@Getter
@NoArgsConstructor
public class T50Entity {
    @Id
    @GeneratedValue
    private int id;

    private Integer codigoProv;
    private Integer codigoCant;
    private Integer codigo;
    private String descripcion;
    private char estado;

    public T50Entity(int id, Integer codigoProv, Integer codigoCant, Integer codigo, String descripcion, char estado) {
        this.id = id;
        this.codigoProv = codigoProv;
        this.codigoCant = codigoCant;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
