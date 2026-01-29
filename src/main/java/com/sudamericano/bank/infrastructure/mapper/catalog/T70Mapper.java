package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T70Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T70Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T70Mapper {
    T70Dto toDto(T70Entity entity);
    T70Entity toEntity(T70Dto dto);
    List<T70Dto> toDtoList(List<T70Entity> entities);
}
