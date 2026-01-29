package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T2Repository extends JpaRepository<T2Entity, Integer> {
}
