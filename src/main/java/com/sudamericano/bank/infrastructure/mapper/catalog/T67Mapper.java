package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T67Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T67Mapper {
    T67Dto toDto(T67Entity entity);
    T67Entity toEntity(T67Dto dto);
    List<T67Dto> toDtoList(List<T67Entity> entities);
}
