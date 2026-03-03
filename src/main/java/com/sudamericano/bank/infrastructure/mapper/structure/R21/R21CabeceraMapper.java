package com.sudamericano.bank.infrastructure.mapper.structure.R21;

import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import com.sudamericano.bank.domain.model.structure.R21.R21Detalle;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R21CabeceraEntity;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R21DetalleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface R21CabeceraMapper {

    @Mapping(target = "detalles", source = "detalles")
    R21Cabecera toDomain(R21CabeceraEntity entity);

    @Mapping(target = "detalles", source = "detalles")
    R21CabeceraEntity toEntity(R21Cabecera domain);

    @Mapping(target = "idCabecera", source = "cabecera.id")
    R21Detalle toDomain(R21DetalleEntity entity);

    @Mapping(target = "cabecera", ignore = true)
    R21DetalleEntity toEntity(R21Detalle domain);
}
