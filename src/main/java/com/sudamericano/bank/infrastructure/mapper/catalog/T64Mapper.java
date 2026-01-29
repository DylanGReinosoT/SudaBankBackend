package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T64Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T64Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T64Mapper {
    T64Dto toDto(T64Entity entity);
    T64Entity toEntity(T64Dto dto);
    List<T64Dto> toDtoList(List<T64Entity> entities);
}
