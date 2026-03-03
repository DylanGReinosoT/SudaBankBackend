package com.sudamericano.bank.infrastructure.pdf;



import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.sudamericano.bank.application.port.out.R22PdfGeneratorPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

@Slf4j
@Component
public class R22OpenPdfAdapter implements R22PdfGeneratorPort {

    private static final Font TITLE_FONT =
            new Font(Font.HELVETICA, 16, Font.BOLD);

    private static final Font BODY_FONT =
            new Font(Font.HELVETICA, 10, Font.NORMAL);

    @Override
    public void generate(Long r22CabeceraId) {

        Path outputPath = Path.of(
                "pdf",
                "r22",
                "R22_" + r22CabeceraId + ".pdf"
        );

        try {
            outputPath.toFile().getParentFile().mkdirs();

            Document document = new Document();
            PdfWriter.getInstance(
                    document,
                    new FileOutputStream(outputPath.toFile())
            );

            document.open();

            document.add(new Paragraph(
                    "R22 REPORT",
                    TITLE_FONT
            ));

            document.add(new Paragraph(
                    "R22 Cabecera ID: " + r22CabeceraId,
                    BODY_FONT
            ));

            document.add(new Paragraph(
                    "Generated automatically by the system.",
                    BODY_FONT
            ));

            document.close();

        } catch (DocumentException | IOException ex) {
            log.error(
                    "Error generating R22 PDF. r22CabeceraId={}",
                    r22CabeceraId,
                    ex
            );
            throw new IllegalStateException(
                    "Error generating R22 PDF",
                    ex
            );
        }
    }
}

