package com.sudamericano.bank.domain.model.catalog;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T3Dto {



    public int id;
    public String codigo;
    public String descripcion;
    public String tipo;
    public Integer codigoParrroquia;
    public String direccion;
    public String telefono;
    public Integer estado;


}
