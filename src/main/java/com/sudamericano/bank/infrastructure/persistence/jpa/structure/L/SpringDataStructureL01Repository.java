package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L01Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataStructureL01Repository extends JpaRepository<L01Entity, Integer> {
    @Query("""
                SELECT e FROM L01Entity e
                WHERE (:codigoTipoIdentificacion IS NULL OR e.codigoTipoIdentificacion = :codigoTipoIdentificacion)
                  AND (:codigoClasificacionEmisor IS NULL OR e.codigoClasificacionEmisor = :codigoClasificacionEmisor)
                  AND (:codigoTipoEmisor IS NULL OR e.codigoTipoEmisor = :codigoTipoEmisor)
            """)
    List<L01Entity> findByFilter(
            @Param("codigoTipoIdentificacion") Integer codigoTipoIdentificacion,
            @Param("codigoClasificacionEmisor") Integer codigoClasificacionEmisor,
            @Param("codigoTipoEmisor") Integer codigoTipoEmisor
    );
}
