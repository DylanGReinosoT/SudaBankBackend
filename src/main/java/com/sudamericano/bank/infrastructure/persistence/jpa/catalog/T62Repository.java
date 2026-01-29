package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T62Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T62Repository extends JpaRepository<T62Entity, Integer> {
}
