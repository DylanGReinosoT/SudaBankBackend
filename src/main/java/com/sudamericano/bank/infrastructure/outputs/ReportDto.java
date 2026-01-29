package com.sudamericano.bank.infrastructure.outputs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportDto {
    public Integer id;
    public String codigo;
    public String descripcion;

    public ReportDto(Integer id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
