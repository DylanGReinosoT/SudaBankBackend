package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T59Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T59Mapper {
    T59Dto toDto(T59Entity entity);
    T59Entity toEntity(T59Dto dto);
    List<T59Dto> toDtoList(List<T59Entity> entities);
}
