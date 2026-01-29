package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R07Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R07Repository extends JpaRepository<R07Entity, Long> {
}
