package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T212Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T212Repository extends JpaRepository<T212Entity, Integer> {
}
