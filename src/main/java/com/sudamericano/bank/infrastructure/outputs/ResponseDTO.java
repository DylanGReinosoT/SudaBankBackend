package com.sudamericano.bank.infrastructure.outputs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO{
    public Integer id;
    public String codigo;
    public String descripcion;
    public ResponseDTO(Integer id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public ResponseDTO(Integer id, String descripcion) {
        this.id = id;
        this.codigo = null;
        this.descripcion = descripcion;
    }
}
