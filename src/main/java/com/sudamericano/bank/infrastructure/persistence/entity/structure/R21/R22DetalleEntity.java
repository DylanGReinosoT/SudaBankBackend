package com.sudamericano.bank.infrastructure.persistence.entity.structure.R21;

import jakarta.persistence.*;

        import java.math.BigDecimal;

@Entity
@Table(name = "R22_DETALLE", schema = "dbo")
public class R22DetalleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE")
    private Long id;

  /* =========================
     Relaciones
     ========================= */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CABECERA", nullable = false)
    private R21CabeceraEntity cabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_R21_DETALLE", nullable = false)
    private R21DetalleEntity r21Detalle;

  /* =========================
     Identificación
     ========================= */

    @Column(name = "TIPO_IDENTIFICACION", nullable = false, length = 1)
    private String identificationType;

    @Column(name = "IDENTIFICACION", nullable = false, length = 13)
    private String identificationNumber;

    @Column(name = "NUMERO_TARJETA_HOMOLOGADO", nullable = false, length = 30)
    private String standardizedCardNumber;

  /* =========================
     Calificación y morosidad
     ========================= */

    @Column(name = "DIAS_MOROSIDAD", nullable = false)
    private Integer daysPastDue;

    @Column(name = "CALIFICACION_PROPIA", nullable = false, length = 5)
    private String internalRating;

    @Column(name = "CALIFICACION_HOMOLOGADA", nullable = false, length = 5)
    private String standardizedRating;

  /* =========================
     Provisiones
     ========================= */

    @Column(name = "BASE_PROVISION", nullable = false, precision = 18, scale = 2)
    private BigDecimal provisionBase;

    @Column(name = "PORCENTAJE_PROVISION", nullable = false, precision = 5, scale = 2)
    private BigDecimal provisionPercentage;

    @Column(name = "PROVISION_REQUERIDA", nullable = false, precision = 18, scale = 2)
    private BigDecimal requiredProvision;

    @Column(name = "PROVISION_CONSTITUIDA", nullable = false, precision = 18, scale = 2)
    private BigDecimal constitutedProvision;

  /* =========================
     Pagos
     ========================= */

    @Column(name = "VALOR_MINIMO_PAGAR", nullable = false, precision = 18, scale = 2)
    private BigDecimal minimumPaymentAmount;

    @Column(name = "VALOR_PAGADO", nullable = false, precision = 18, scale = 2)
    private BigDecimal amountPaid;

    @Column(name = "VALOR_PAGAR_CAPITAL", nullable = false, precision = 18, scale = 2)
    private BigDecimal capitalPaymentAmount;

  /* =========================
     Cargos del mes
     ========================= */

    @Column(name = "INTERES_MES", nullable = false, precision = 18, scale = 2)
    private BigDecimal monthlyInterest;

    @Column(name = "SEGURO_MES", nullable = false, precision = 18, scale = 2)
    private BigDecimal monthlyInsurance;

  /* =========================
     Capital diferido
     ========================= */

    @Column(name = "SALDO_CAPITAL_DIFERIDO", nullable = false, precision = 18, scale = 2)
    private BigDecimal deferredCapitalBalance;

    @Column(name = "INTERES_CAPITAL_DIFERIDO", nullable = false, precision = 18, scale = 2)
    private BigDecimal deferredCapitalInterest;

  /* =========================
     Getters & Setters
     ========================= */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public R21CabeceraEntity getCabecera() {
        return cabecera;
    }

    public void setCabecera(R21CabeceraEntity cabecera) {
        this.cabecera = cabecera;
    }

    public R21DetalleEntity getR21Detalle() {
        return r21Detalle;
    }

    public void setR21Detalle(R21DetalleEntity r21Detalle) {
        this.r21Detalle = r21Detalle;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getStandardizedCardNumber() {
        return standardizedCardNumber;
    }

    public void setStandardizedCardNumber(String standardizedCardNumber) {
        this.standardizedCardNumber = standardizedCardNumber;
    }

    public Integer getDaysPastDue() {
        return daysPastDue;
    }

    public void setDaysPastDue(Integer daysPastDue) {
        this.daysPastDue = daysPastDue;
    }

    public String getInternalRating() {
        return internalRating;
    }

    public void setInternalRating(String internalRating) {
        this.internalRating = internalRating;
    }

    public String getStandardizedRating() {
        return standardizedRating;
    }

    public void setStandardizedRating(String standardizedRating) {
        this.standardizedRating = standardizedRating;
    }

    public BigDecimal getProvisionBase() {
        return provisionBase;
    }

    public void setProvisionBase(BigDecimal provisionBase) {
        this.provisionBase = provisionBase;
    }

    public BigDecimal getProvisionPercentage() {
        return provisionPercentage;
    }

    public void setProvisionPercentage(BigDecimal provisionPercentage) {
        this.provisionPercentage = provisionPercentage;
    }

    public BigDecimal getRequiredProvision() {
        return requiredProvision;
    }

    public void setRequiredProvision(BigDecimal requiredProvision) {
        this.requiredProvision = requiredProvision;
    }

    public BigDecimal getConstitutedProvision() {
        return constitutedProvision;
    }

    public void setConstitutedProvision(BigDecimal constitutedProvision) {
        this.constitutedProvision = constitutedProvision;
    }

    public BigDecimal getMinimumPaymentAmount() {
        return minimumPaymentAmount;
    }

    public void setMinimumPaymentAmount(BigDecimal minimumPaymentAmount) {
        this.minimumPaymentAmount = minimumPaymentAmount;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public BigDecimal getCapitalPaymentAmount() {
        return capitalPaymentAmount;
    }

    public void setCapitalPaymentAmount(BigDecimal capitalPaymentAmount) {
        this.capitalPaymentAmount = capitalPaymentAmount;
    }

    public BigDecimal getMonthlyInterest() {
        return monthlyInterest;
    }

    public void setMonthlyInterest(BigDecimal monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public BigDecimal getMonthlyInsurance() {
        return monthlyInsurance;
    }

    public void setMonthlyInsurance(BigDecimal monthlyInsurance) {
        this.monthlyInsurance = monthlyInsurance;
    }

    public BigDecimal getDeferredCapitalBalance() {
        return deferredCapitalBalance;
    }

    public void setDeferredCapitalBalance(BigDecimal deferredCapitalBalance) {
        this.deferredCapitalBalance = deferredCapitalBalance;
    }

    public BigDecimal getDeferredCapitalInterest() {
        return deferredCapitalInterest;
    }

    public void setDeferredCapitalInterest(BigDecimal deferredCapitalInterest) {
        this.deferredCapitalInterest = deferredCapitalInterest;
    }
}

