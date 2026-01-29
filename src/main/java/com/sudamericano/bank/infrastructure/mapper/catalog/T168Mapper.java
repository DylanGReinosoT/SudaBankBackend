package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T168Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T168Mapper {
    T168Dto toDto(T168Entity entity);
    T168Entity toEntity(T168Dto dto);
    List<T168Dto> toDtoList(List<T168Entity> entities);
}
