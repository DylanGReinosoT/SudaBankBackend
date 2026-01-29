package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T69Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T69Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T69Mapper {
    T69Dto toDto(T69Entity entity);
    T69Entity toEntity(T69Dto dto);
    List<T69Dto> toDtoList(List<T69Entity> entities);
}
