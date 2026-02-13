package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T9Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T9Repository extends JpaRepository<T9Entity, Integer> {
}
