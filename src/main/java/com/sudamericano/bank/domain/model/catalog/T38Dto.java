package com.sudamericano.bank.domain.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T38Dto {
    public int id;
    public String codigo;
    public String descripcion;
    public String periodicidad;


}
