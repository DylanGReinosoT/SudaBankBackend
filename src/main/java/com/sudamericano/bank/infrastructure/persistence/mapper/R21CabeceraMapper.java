package com.sudamericano.bank.infrastructure.persistence.mapper;


import com.sudamericano.bank.domain.model.aggregate.R21Cabecera;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R21CabeceraEntity;


    public final class R21CabeceraMapper {

        private R21CabeceraMapper() {
        }

        public static R21Cabecera toDomain(R21CabeceraEntity entity) {

            // Aggregate root SOLO con su identidad
            return new R21Cabecera(entity.getId());
        }
    }


