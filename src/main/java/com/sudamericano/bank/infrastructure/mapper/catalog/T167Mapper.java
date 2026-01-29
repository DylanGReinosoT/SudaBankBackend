package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T167Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T167Mapper {
    T167Dto toDto(T167Entity entity);
    T167Entity toEntity(T167Dto dto);
    List<T167Dto> toDtoList(List<T167Entity> entities);
}
