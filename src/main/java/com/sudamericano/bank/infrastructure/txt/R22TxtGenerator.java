package com.sudamericano.bank.infrastructure.txt;

import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class R22TxtGenerator {

    public void generate(
            String codigoEntidad,
            String fechaCorte,
            int totalRegistros,
            List<R22Detalle> detalles,
            Path outputFile
    ) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {

            // Cabecera (usa R21_CABECERA)
            writer.write(String.join("|",
                    "R22",
                    codigoEntidad,
                    fechaCorte,
                    String.valueOf(totalRegistros)
            ));
            writer.newLine();

            // Detalle
            for (R22Detalle detalle : detalles) {
                R22TxtLine line = R22TxtMapper.map(detalle);
                writer.write(line.toLine());
                writer.newLine();
            }
        }
    }
}

