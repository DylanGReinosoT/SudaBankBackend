package com.sudamericano.bank.application.port.out;


import com.sudamericano.bank.domain.model.aggregate.R21Cabecera;

public interface R21CabeceraRepository {

    R21Cabecera loadById(Long r21CabeceraId);
}

