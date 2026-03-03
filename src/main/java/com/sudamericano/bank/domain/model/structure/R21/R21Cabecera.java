package com.sudamericano.bank.domain.model.structure.R21;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R21Cabecera {
    private Long id;
    private String codigoEstructura;
    private String codigoEntidad;
    private LocalDate fechaCorte;
    private Integer totalRegistros;
    private LocalDateTime fechaCarga;
    private String estadoEnvio;
    private List<R21Detalle> detalles;
}
