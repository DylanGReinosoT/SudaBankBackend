package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T32Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T32Repository extends JpaRepository<T32Entity, Integer> {
}
