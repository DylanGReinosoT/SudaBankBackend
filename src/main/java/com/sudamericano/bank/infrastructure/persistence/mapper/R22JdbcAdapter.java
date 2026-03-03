package com.sudamericano.bank.infrastructure.persistence.mapper;

import com.sudamericano.bank.application.mapper.R22ReadModelMapper;

import com.sudamericano.bank.application.port.out.LoadR22DetallePort;
import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import com.sudamericano.bank.infrastructure.persistence.R22ReadModel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class R22JdbcAdapter implements LoadR22DetallePort {

    private final JdbcTemplate jdbcTemplate;

    private static final String SQL = """
        SELECT
            TIPO_IDENTIFICACION,
            IDENTIFICACION,
            NUMERO_TARJETA_HOMOLOGADO,
            DIAS_MOROSIDAD,
            CALIFICACION_PROPIA,
            CALIFICACION_HOMOLOGADA,
            BASE_PROVISION,
            PORCENTAJE_PROVISION,
            PROVISION_REQUERIDA,
            PROVISION_CONSTITUIDA,
            VALOR_MINIMO_PAGAR,
            VALOR_PAGADO,
            VALOR_PAGAR_CAPITAL,
            INTERES_MES,
            SEGURO_MES,
            SALDO_CAPITAL_DIFERIDO,
            INTERES_CAPITAL_DIFERIDO
        FROM R22_DETALLE
        WHERE ID_CABECERA = ?
        ORDER BY ID_DETALLE
        """;

    @Override
    public List<R22Detalle> loadByCabeceraId(Long r21CabeceraId) {

        List<R22ReadModel> rows =
                jdbcTemplate.query(SQL, new R22ReadModelRowMapper(), r21CabeceraId);

        return rows.stream()
                .map(R22ReadModelMapper::toDomain)
                .toList();
    }
}

