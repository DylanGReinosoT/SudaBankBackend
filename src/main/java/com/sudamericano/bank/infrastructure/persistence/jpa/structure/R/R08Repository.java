package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R08Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R08Repository extends JpaRepository<R08Entity, Long> {
}
