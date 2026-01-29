package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T79Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T79Mapper {
    T79Dto toDto(T79Entity entity);
    T79Entity toEntity(T79Dto dto);
    List<T79Dto> toDtoList(List<T79Entity> entities);
}
