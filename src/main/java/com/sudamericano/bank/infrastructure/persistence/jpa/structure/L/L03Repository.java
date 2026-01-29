package com.sudamericano.bank.infrastructure.persistence.jpa.structure.L;

import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L03Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection.L03ViewProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface L03Repository extends JpaRepository<L03Entity, Long> {
    @Query(value = """
        SELECT L.ID AS id,
               T4.CODIGO AS codigoTipoIdentificacionEmisor,
               T4.DESCRIPCION AS descripcionTipoIdentificacionEmisor,
               T164.CODIGO AS codigoIdentificacionEmisor,
               T164.DESCRIPCION AS descripcionIdentificacionEmisor,
               L.NUMERO_TITULO AS numeroTitulo,
               L.FECHA_EMISION AS fechaEmision,
               L.FECHA_COMPRA AS fechaCompra,
               T70.CODIGO AS codigoEstadoTitulo,
               T70.DESCRIPCION AS descripcionEstadoTitulo,
               T67.CODIGO AS codigoCategoriaInversion,
               T67.DESCRIPCION AS descripcionCategoriaInversion,
               T68.CODIGO AS codigoRangoVencimiento,
               T68.DESCRIPCION AS descripcionRangoVencimiento
        FROM BSCOREDB.dbo.NESL03 L
            INNER JOIN BSCOREDB.dbo.T4 T4 ON L.CODIGO_TIPO_IDENTIFICACION_EMISOR = T4.ID
            INNER JOIN BSCOREDB.dbo.T164 T164 ON L.CODIGO_IDENTIFICACION_EMISOR = T164.ID
            INNER JOIN BSCOREDB.dbo.T70 T70 ON L.CODIGO_ESTADO_TITULO = T70.ID
            INNER JOIN BSCOREDB.dbo.T67 T67 ON L.CODIGO_CATEGORIA_INVERSION = T67.ID
            INNER JOIN BSCOREDB.dbo.T68 T68 ON L.CODIGO_RANGO_VENCIMIENTO   = T68.ID
        """, nativeQuery = true)
    List<L03ViewProjection> findAllResumenDatosL03();
}
