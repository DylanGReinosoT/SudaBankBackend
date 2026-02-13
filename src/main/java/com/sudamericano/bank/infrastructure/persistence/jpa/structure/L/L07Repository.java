package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L07Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface L07Repository extends JpaRepository<L07Entity, Long> {
}
