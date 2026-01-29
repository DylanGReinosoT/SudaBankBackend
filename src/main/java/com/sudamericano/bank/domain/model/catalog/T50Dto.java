package com.sudamericano.bank.domain.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T50Dto {
    public int id;

    public Integer codigoProv;
    public Integer codigoCant;
    public Integer codigo;
    public String descripcion;
    public char estado;
}
