package com.sudamericano.bank.infrastructure.persistence;

import com.sudamericano.bank.application.port.out.R22GenerationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class R22GenerationJdbcAdapter implements R22GenerationPort {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void generateFromR21(Long r21CabeceraId, Long r22CabeceraId) {

        jdbcTemplate.update(
                "EXEC dbo.SP_R22_GENERAR_DESDE_R21 ?, ?",
                r21CabeceraId,
                r22CabeceraId
        );
    }
}

