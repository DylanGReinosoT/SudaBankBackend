package com.sudamericano.bank.infrastructure.persistence.adapter;

import com.sudamericano.bank.application.port.out.ExecuteR22StoredProcedurePort;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ExecuteR22StoredProcedureJdbcAdapter
        implements ExecuteR22StoredProcedurePort {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void execute(Long r21CabeceraId, Long r22CabeceraId) {

        jdbcTemplate.update(
                "EXEC SP_R22_GENERAR_DESDE_R21 @ID_R21_CABECERA = ?, @ID_R22_CABECERA = ?",
                r21CabeceraId,
                r22CabeceraId
        );
    }
}
