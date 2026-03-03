package com.sudamericano.bank.infrastructure.persistence;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class R22ReadModel {

    private String tipoIdentificacion;
    private String identificacion;
    private String numeroTarjetaHomologado;

    private Integer diasMorosidad;
    private String calificacionPropia;
    private String calificacionHomologada;

    private BigDecimal baseProvision;
    private BigDecimal porcentajeProvision;
    private BigDecimal provisionRequerida;
    private BigDecimal provisionConstituida;

    private BigDecimal valorMinimoPagar;
    private BigDecimal valorPagado;
    private BigDecimal valorPagarCapital;

    private BigDecimal interesMes;
    private BigDecimal seguroMes;

    private BigDecimal saldoCapitalDiferido;
    private BigDecimal interesCapitalDiferido;

    /* getters y setters */
    // (pueden ser Lombok si quieres, aquí explícitos por claridad)
}

