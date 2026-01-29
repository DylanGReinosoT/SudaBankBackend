package com.sudamericano.bank.infrastructure.persistence.jpa.catalog;

import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T38Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface T38Repository extends JpaRepository<T38Entity, Integer> {

}
