package com.sudamericano.bank.infrastructure.txt;


import com.sudamericano.bank.application.port.out.R22TxtExportPort;
import com.sudamericano.bank.domain.model.structure.R21.R22Header;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@RequiredArgsConstructor
public class R22TxtFileAdapter implements R22TxtExportPort {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void exportTxt(Long r22CabeceraId, String outputPath) {

        R22Header header = jdbcTemplate.queryForObject("""
            SELECT
                COD_ESTRUCTURA,
                COD_ENTIDAD,
                FECHA_CORTE,
                TOTAL_REGISTROS
            FROM R21_CABECERA
            WHERE ID_CABECERA = ?
              AND COD_ESTRUCTURA = 'R22'
        """, (rs, rowNum) -> new R22Header(
                rs.getString("COD_ESTRUCTURA"),
                rs.getString("COD_ENTIDAD"),
                rs.getDate("FECHA_CORTE").toLocalDate(),
                rs.getInt("TOTAL_REGISTROS")
        ), r22CabeceraId);

        List<R22TxtLine> details = jdbcTemplate.query("""
            SELECT
                TIPO_IDENTIFICACION,
                IDENTIFICACION,
                NUMERO_TARJETA_HOMOLOGADO,
                DIAS_MOROSIDAD,
                CALIFICACION_PROPIA,
                PROVISION_REQUERIDA
            FROM R22_DETALLE
            WHERE ID_CABECERA = ?
        """, (rs, rowNum) -> new R22TxtLine(
                rs.getString("TIPO_IDENTIFICACION"),
                rs.getString("IDENTIFICACION"),
                rs.getString("NUMERO_TARJETA_HOMOLOGADO"),
                rs.getInt("DIAS_MOROSIDAD"),
                rs.getString("CALIFICACION_PROPIA"),
                rs.getBigDecimal("PROVISION_REQUERIDA")
        ), r22CabeceraId);

        try {
            Path path = Path.of(outputPath);
            Files.createDirectories(path.getParent());

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {

                // CABECERA
                writer.write(
                        header.estructura() + "|" +
                                header.codigoEntidad() + "|" +
                                header.fechaCorte()
                                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "|" +
                                header.totalRegistros()
                );
                writer.newLine();

                // DETALLE
                DecimalFormat df = new DecimalFormat("0.00");

                for (R22TxtLine d : details) {
                    writer.write(
                            d.tipoIdentificacion() + "|" +
                                    d.identificacion() + "|" +
                                    d.numeroTarjetaHomologado() + "|" +
                                    d.diasMorosidad() + "|" +
                                    d.calificacion() + "|" +
                                    df.format(d.provisionRequerida())
                    );
                    writer.newLine();
                }
            }

        } catch (Exception e) {
            throw new IllegalStateException("Error generating R22 TXT", e);
        }
    }
}

