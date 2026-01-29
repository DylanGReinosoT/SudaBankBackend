package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;

import java.util.List;

public interface T65RepositoryPort {
    List<T65Dto> findAll();
}
