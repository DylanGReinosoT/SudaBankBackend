package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class L02ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public ResponseDTO emisor;
    public String numeroTitulo;
    public LocalDate fechaEmision;
    public LocalDate fechaVencimiento;
    public ResponseDTO instrumento;
    public ResponseDTO categoriaInstrumento;
    public ResponseDTO tipoInstrumento;
    public String identificacionInstrumento;
}

