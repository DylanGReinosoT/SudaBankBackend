package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T25")
@Getter
@NoArgsConstructor
public class T25Entity {

    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;
    private char estado;
    private String observacion;

    public T25Entity(int id, String codigo, String descripcion, char estado, String observacion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.observacion = observacion;
    }




}
