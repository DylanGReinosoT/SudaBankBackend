package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T68Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T68Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T68Mapper {
    T68Dto toDto(T68Entity entity);
    T68Entity toEntity(T68Dto dto);
    List<T68Dto> toDtoList(List<T68Entity> entities);
}
