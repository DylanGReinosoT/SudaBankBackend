package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T165Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T165Mapper {
    T165Dto toDto(T165Entity entity);
    T165Entity toEntity(T165Dto dto);
    List<T165Dto> toDtoList(List<T165Entity> entities);
}
