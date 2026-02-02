package com.sudamericano.bank.application.usecase.structure.R21;

import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import java.util.List;
import java.util.Optional;

public interface R21CabeceraUseCase {
    R21Cabecera create(R21Cabecera r21Cabecera);
    R21Cabecera update(Long id, R21Cabecera r21Cabecera);
    Optional<R21Cabecera> getById(Long id);
    List<R21Cabecera> getAll();
    void delete(Long id);
    byte[] getReport(Long id);
}
