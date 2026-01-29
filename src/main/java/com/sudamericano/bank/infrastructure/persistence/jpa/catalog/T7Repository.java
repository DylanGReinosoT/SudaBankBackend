package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T7Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T7Repository extends JpaRepository<T7Entity, Integer> {
}
