package com.sudamericano.bank.infrastructure.persistence.mapper;



import com.sudamericano.bank.infrastructure.persistence.R22ReadModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class R22ReadModelRowMapper implements RowMapper<R22ReadModel> {

    @Override
    public R22ReadModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        R22ReadModel rm = new R22ReadModel();

        rm.setTipoIdentificacion(rs.getString("TIPO_IDENTIFICACION"));
        rm.setIdentificacion(rs.getString("IDENTIFICACION"));
        rm.setNumeroTarjetaHomologado(rs.getString("NUMERO_TARJETA_HOMOLOGADO"));

        rm.setDiasMorosidad(rs.getInt("DIAS_MOROSIDAD"));
        rm.setCalificacionPropia(rs.getString("CALIFICACION_PROPIA"));
        rm.setCalificacionHomologada(rs.getString("CALIFICACION_HOMOLOGADA"));

        rm.setBaseProvision(rs.getBigDecimal("BASE_PROVISION"));
        rm.setPorcentajeProvision(rs.getBigDecimal("PORCENTAJE_PROVISION"));
        rm.setProvisionRequerida(rs.getBigDecimal("PROVISION_REQUERIDA"));
        rm.setProvisionConstituida(rs.getBigDecimal("PROVISION_CONSTITUIDA"));

        rm.setValorMinimoPagar(rs.getBigDecimal("VALOR_MINIMO_PAGAR"));
        rm.setValorPagado(rs.getBigDecimal("VALOR_PAGADO"));
        rm.setValorPagarCapital(rs.getBigDecimal("VALOR_PAGAR_CAPITAL"));

        rm.setInteresMes(rs.getBigDecimal("INTERES_MES"));
        rm.setSeguroMes(rs.getBigDecimal("SEGURO_MES"));

        rm.setSaldoCapitalDiferido(rs.getBigDecimal("SALDO_CAPITAL_DIFERIDO"));
        rm.setInteresCapitalDiferido(rs.getBigDecimal("INTERES_CAPITAL_DIFERIDO"));

        return rm;
    }
}
