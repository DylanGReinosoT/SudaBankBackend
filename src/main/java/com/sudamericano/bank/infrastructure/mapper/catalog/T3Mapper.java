package com.sudamericano.bank.infrastructure.mapper.catalog;


import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T3Entity;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class T3Mapper {
   public T3Dto toDto(T3Entity entity){
       return new T3Dto(
               entity.getId(),
               entity.getCodigo(),
               entity.getDescripcion(),
               entity.getTipo(),
               entity.getCodigoParrroquia(),
               entity.getDireccion(),
               entity.getTelefono(),
               entity.getEstado()
       );
   }
}
