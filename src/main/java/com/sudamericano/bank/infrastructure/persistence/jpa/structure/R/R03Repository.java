package com.sudamericano.bank.infrastructure.persistence.jpa.structure.R;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R03Entity;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R03Repository  extends JpaRepository<R03Entity, Long>
{




}
