package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T169Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T169Mapper {
    T169Dto toDto(T169Entity entity);
    T169Entity toEntity(T169Dto dto);
    List<T169Dto> toDtoList(List<T169Entity> entities);
}
