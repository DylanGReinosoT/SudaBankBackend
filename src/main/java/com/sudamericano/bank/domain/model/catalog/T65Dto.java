package com.sudamericano.bank.domain.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T65Dto {
    public int id;
    public String codigo;
    public String descripcion;
    private String sp;
    private String moodys;
    private String fitch;
    private String estado;
}
