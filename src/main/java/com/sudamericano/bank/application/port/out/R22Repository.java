package com.sudamericano.bank.application.port.out;

import com.sudamericano.bank.domain.model.aggregate.R21Cabecera;

public interface R22Repository {
    R21Cabecera loadAggregate(Long r21CabeceraId);
    void save(R21Cabecera aggregate);
}
