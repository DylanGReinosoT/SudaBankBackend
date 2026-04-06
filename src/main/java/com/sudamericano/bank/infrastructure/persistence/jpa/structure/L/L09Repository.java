    package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

    import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L09Entity;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface L09Repository extends JpaRepository<L09Entity, Long> {
    }
