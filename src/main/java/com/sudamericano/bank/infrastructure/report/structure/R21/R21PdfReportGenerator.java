package com.sudamericano.bank.infrastructure.report.structure.R21;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;

@Component
public class R21PdfReportGenerator {

    public byte[] generateReport(R21Cabecera r21Cabecera) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            PdfWriter writer = new PdfWriter(out);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Reporte de Estructura R21").setBold().setFontSize(18));
            document.add(new Paragraph("Código Entidad: " + r21Cabecera.getCodigoEntidad()));
            document.add(new Paragraph("Fecha de Corte: " + r21Cabecera.getFechaCorte()));
            document.add(new Paragraph("Total Registros: " + r21Cabecera.getTotalRegistros()));

            if (r21Cabecera.getDetalles() != null && !r21Cabecera.getDetalles().isEmpty()) {
                Table table = new Table(4);
                table.addCell("Identificación");
                table.addCell("Tarjeta");
                table.addCell("Cupo");
                table.addCell("Capital Consumo");

                r21Cabecera.getDetalles().forEach(detalle -> {
                    table.addCell(detalle.getIdentificacion());
                    table.addCell(detalle.getNumeroTarjetaHomologado());
                    table.addCell(detalle.getCupoTarjeta() != null ? detalle.getCupoTarjeta().toString() : "0");
                    table.addCell(detalle.getCapitalConsumoMes() != null ? detalle.getCapitalConsumoMes().toString() : "0");
                });
                document.add(table);
            }

            document.close();
        } catch (Exception e) {
            throw new RuntimeException("Error al generar el PDF", e);
        }
        return out.toByteArray();
    }
}
