package com.sudamericano.bank.infrastructure.persistence.entity.catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T173")
@Data
@NoArgsConstructor
@Builder
public class CatalogT173Entity {
    @Id
    @GeneratedValue
    private int id;

    private String codigo;
    private String descripcion;

    public CatalogT173Entity(int id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
