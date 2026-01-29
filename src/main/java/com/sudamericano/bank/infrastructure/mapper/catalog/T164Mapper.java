package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T164Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T164Mapper {
    T164Dto toDto(T164Entity entity);
    T164Entity toEntity(T164Dto dto);
    List<T164Dto> toDtoList(List<T164Entity> entities);
}
