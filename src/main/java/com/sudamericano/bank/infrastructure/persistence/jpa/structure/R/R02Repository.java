package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R02Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R02Repository extends JpaRepository<R02Entity, Long> {
}
