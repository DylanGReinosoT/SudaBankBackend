package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T62AEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T62AMapper {
    T62ADto toDto(T62AEntity entity);
    T62AEntity toEntity(T62ADto dto);
    List<T62ADto> toDtoList(List<T62AEntity> entities);
}
