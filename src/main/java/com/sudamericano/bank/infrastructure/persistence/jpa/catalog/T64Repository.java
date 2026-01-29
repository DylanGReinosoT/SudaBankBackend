package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T64Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T64Repository extends JpaRepository<T64Entity, Integer> {

}
