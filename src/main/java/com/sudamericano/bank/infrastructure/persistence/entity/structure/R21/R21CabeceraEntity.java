package com.sudamericano.bank.infrastructure.persistence.entity.structure.R21;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "R21_CABECERA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class R21CabeceraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CABECERA")
    private Long id;

    @Column(name = "COD_ESTRUCTURA")
    private String codigoEstructura;

    @Column(name = "COD_ENTIDAD")
    private String codigoEntidad;

    @Column(name = "FECHA_CORTE")
    private LocalDate fechaCorte;

    @Column(name = "TOTAL_REGISTROS")
    private Integer totalRegistros;

    @Column(name = "FECHA_CARGA")
    private LocalDateTime fechaCarga;

    @Column(name = "ESTADO_ENVIO")
    private String estadoEnvio;

    @OneToMany(mappedBy = "cabecera", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<R21DetalleEntity> detalles;
}
