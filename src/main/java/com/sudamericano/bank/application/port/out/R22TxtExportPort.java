package com.sudamericano.bank.application.port.out;


public interface R22TxtExportPort {

    void exportTxt(Long r22CabeceraId, String outputPath);
}

