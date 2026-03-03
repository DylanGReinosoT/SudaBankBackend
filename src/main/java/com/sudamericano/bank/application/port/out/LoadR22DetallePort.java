package com.sudamericano.bank.application.port.out;

import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.util.List;

public interface LoadR22DetallePort {

    List<R22Detalle> loadByCabeceraId(Long r21CabeceraId);
}

