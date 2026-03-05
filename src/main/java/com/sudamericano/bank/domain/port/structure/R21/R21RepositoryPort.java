package com.sudamericano.bank.domain.port.structure.R21;

import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import java.util.Optional;
import java.util.List;

public interface R21RepositoryPort {
    R21Cabecera save(R21Cabecera r21Cabecera);
    Optional<R21Cabecera> findById(Long id);
    List<R21Cabecera> findAll();
    void deleteById(Long id);
}
