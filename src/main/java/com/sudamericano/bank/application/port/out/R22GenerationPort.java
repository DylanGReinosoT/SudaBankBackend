package com.sudamericano.bank.application.port.out;


public interface R22GenerationPort {

    void generateFromR21(Long r21CabeceraId, Long r22CabeceraId);

}
