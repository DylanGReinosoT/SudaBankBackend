package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T170Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T170Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T170Mapper {
    T170Dto toDto(T170Entity entity);
    T170Entity toEntity(T170Dto dto);
    List<T170Dto> toDtoList(List<T170Entity> entities);
}
