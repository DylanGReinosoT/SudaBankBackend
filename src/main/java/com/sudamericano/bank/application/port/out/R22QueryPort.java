package com.sudamericano.bank.application.port.out;



import com.sudamericano.bank.domain.model.aggregate.R21Cabecera;
import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.util.List;

public interface R22QueryPort {

    R21Cabecera findCabeceraById(Long r22CabeceraId);

    List<R22Detalle> findDetallesByCabeceraId(Long r22CabeceraId);
}

