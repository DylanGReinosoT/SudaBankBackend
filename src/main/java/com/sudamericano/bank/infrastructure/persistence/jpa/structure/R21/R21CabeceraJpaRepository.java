package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R21;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R21CabeceraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R21CabeceraJpaRepository extends JpaRepository<R21CabeceraEntity, Long> {
}
