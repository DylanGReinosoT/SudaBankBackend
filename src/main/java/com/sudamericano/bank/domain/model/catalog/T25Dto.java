package com.sudamericano.bank.domain.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T25Dto {
    public int id;
    public String codigo;
    public String descripcion;
    public char estado;
    public String observacion;
}
