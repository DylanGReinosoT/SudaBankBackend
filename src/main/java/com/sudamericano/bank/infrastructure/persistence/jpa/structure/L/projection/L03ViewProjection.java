package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection;

import java.time.LocalDate;

public interface L03ViewProjection {
    Long getId();
    String getCodigoTipoIdentificacionEmisor();
    String getDescripcionTipoIdentificacionEmisor();
    String getCodigoIdentificacionEmisor();
    String getDescripcionIdentificacionEmisor();
    String getNumeroTitulo();
    LocalDate getFechaEmision();
    LocalDate getFechaCompra();
    String getCodigoEstadoTitulo();
    String getDescripcionEstadoTitulo();
    String getCodigoCategoriaInversion();
    String getDescripcionCategoriaInversion();
    String getCodigoRangoVencimiento();
    String getDescripcionRangoVencimiento();
}

