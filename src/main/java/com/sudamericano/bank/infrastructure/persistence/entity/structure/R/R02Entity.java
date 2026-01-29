package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR02")
public class R02Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "VALOR_OPERACION", precision = 15, scale = 2)
    private BigDecimal valorOperacion;

    @Column(name = "TASA_INT_NOMINAL", precision = 4, scale = 2)
    private BigDecimal tasaInteresNominal;

    @Column(name= "TEA", precision = 4, scale = 2)
    private BigDecimal tea;

    @Column(name = "CODIGO_MONEDA")
    private Integer codigoMoneda;

    @Column(name = "FECH_CONCESION")
    private LocalDate fechaConcesion;

    @Column(name = "FECH_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "CODIGO_LINEA_CREDITO")
    private Integer codigoLineaCredito;

    @Column(name = "CODIGO_PERIODICIDAD_PAGO")
    private Integer codigoPeriodicidadPago;

    @Column(name = "FRECUENCIA_REVISION")
    private BigDecimal frecuenciaRevision;

    @Column(name = "CODIGO_OFICINA_CONCESION")
    private Integer codigoOficinaConcesion;

    @Column(name = "CODIGO_GARANTE_GARANTIAS")
    private Integer codigoGaranteGarantias;

    @Column(name = "CODIGO_IND_OPER_EXENTA")
    private Integer codigoIndicadorOperacionesExenta;

    @Column(name = "CODIGO_TIPO_CREDITO")
    private Integer codigoTipoCredito;

    @Column(name = "CODIGO_CLASE_CREDITO")
    private Integer codigoClaseCredito;

    @Column(name = "CODIGO_ESTADO_OPERACION")
    private Integer codigoEstadoOperacion;

    @Column(name = "CODIGO_SITUA_OPERACION")
    private Integer codigoSituaOperacion;

    @Column(name = "CODIGO_TIPO_OPERACION")
    private Integer codigoTipoOperacion;

    @Column(name = "CODIGO_DEST_FIN_OPERACION")
    private Integer codigoDestFinOperacion;

    @Column(name = "CODIGO_ACTIV_ECONO_RECPETORA")
    private Integer codigoActividadEconoReceptora;

    @Column(name = "CODIGO_DESTINO_GEOGRAF_PAIS")
    private Integer codigoDestinoGeograficaPais;

    @Column(name = "CODIGO_DESTINO_GEOGRAF_PROVINCIA")
    private Integer codigoDestinoGeograficaProvincia;

    @Column(name = "CODIGO_DESTINO_GEOGRAF_CANTON")
    private Integer codigoDestinoGeograficaCanton;

    @Column(name = "CODIGO_DESTINO_GEOGRAF_PARROQUIA")
    private Integer codigoDestinoGeograficaParroquia;

    @Column(name = "TOTAL_INGRESO", precision = 15, scale = 2)
    private BigDecimal totalIngreso;

    @Column(name = "TOTAL_EGRESO", precision = 15, scale = 2)
    private BigDecimal totalEgreso;

    @Column(name = "CODIGO_NIV_ESTUDIO_ESPERADO")
    private Integer codigoNivEstudioEsperado;

    @Column(name = "NUM_EMPLEADOS_MANT", precision = 5, scale = 0)
    private Integer numEmpleadosMant;

    @Column(name = "NUM_EMPLEADOS_INCREMENT",precision = 5, scale = 0)
    private Integer numEmpleadosIncrement;

    @Column(name = "PRODUCCION_ACTUAL", precision = 15, scale = 2)
    private BigDecimal produccionActual;

    @Column(name = "INCREMENT_ACTUAL_ESPE", precision = 15, scale = 2)
    private BigDecimal incrementActualEspe;

    @Column(name = "PROD_ACTUAL_MANT",   precision = 15, scale = 2)
    private BigDecimal mantenerProduccionExportable;

    @Column(name = "INCREMENT_ESPE_PROD", precision = 15, scale = 2)
    private BigDecimal incrementoProduccionExportable;

    @Column(name = "CONTRIBUC_FBK", precision = 15, scale = 2)
    private BigDecimal contribucFbk;

    @Column(name = "INCREMENTO_INV_FBK", precision = 15, scale = 2)
    private BigDecimal incremnetoInvFbk;

    @Column(name = "CONTRIBUCION-INT_CANCER", precision = 15, scale = 2)
    private BigDecimal contribucionIntCancer;

    @Column(name = "DESTI_CRED_INMUEBLES")
    private Integer destiCredInmuebles;

    @Column(name = "VALOR_COMERCIAL_INM", precision = 15, scale = 2)
    private BigDecimal valorComercialInm;

    @Column(name = "METROS_CUADRADOS", precision = 15, scale = 2)
    private BigDecimal metrosCuadrados;

    @Column(name = "NUMERO_TOTAL_PERSONA_APORTAN", precision = 4, scale = 0)
    private Integer numeroTotalPersonaAportan;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public BigDecimal getValorOperacion() {
        return valorOperacion;
    }

    public void setValorOperacion(BigDecimal valorOperacion) {
        this.valorOperacion = valorOperacion;
    }

    public BigDecimal getTasaInteresNominal() {
        return tasaInteresNominal;
    }

    public void setTasaInteresNominal(BigDecimal tasaInteresNominal) {
        this.tasaInteresNominal = tasaInteresNominal;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public Integer getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(Integer codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public LocalDate getFechaConcesion() {
        return fechaConcesion;
    }

    public void setFechaConcesion(LocalDate fechaConcesion) {
        this.fechaConcesion = fechaConcesion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCodigoLineaCredito() {
        return codigoLineaCredito;
    }

    public void setCodigoLineaCredito(Integer codigoLineaCredito) {
        this.codigoLineaCredito = codigoLineaCredito;
    }

    public Integer getCodigoPeriodicidadPago() {
        return codigoPeriodicidadPago;
    }

    public void setCodigoPeriodicidadPago(Integer codigoPeriodicidadPago) {
        this.codigoPeriodicidadPago = codigoPeriodicidadPago;
    }

    public BigDecimal getFrecuenciaRevision() {
        return frecuenciaRevision;
    }

    public void setFrecuenciaRevision(BigDecimal frecuenciaRevision) {
        this.frecuenciaRevision = frecuenciaRevision;
    }

    public Integer getCodigoOficinaConcesion() {
        return codigoOficinaConcesion;
    }

    public void setCodigoOficinaConcesion(Integer codigoOficinaConcesion) {
        this.codigoOficinaConcesion = codigoOficinaConcesion;
    }

    public Integer getCodigoGaranteGarantias() {
        return codigoGaranteGarantias;
    }

    public void setCodigoGaranteGarantias(Integer codigoGaranteGarantias) {
        this.codigoGaranteGarantias = codigoGaranteGarantias;
    }

    public Integer getCodigoIndicadorOperacionesExenta() {
        return codigoIndicadorOperacionesExenta;
    }

    public void setCodigoIndicadorOperacionesExenta(Integer codigoIndicadorOperacionesExenta) {
        this.codigoIndicadorOperacionesExenta = codigoIndicadorOperacionesExenta;
    }

    public Integer getCodigoTipoCredito() {
        return codigoTipoCredito;
    }

    public void setCodigoTipoCredito(Integer codigoTipoCredito) {
        this.codigoTipoCredito = codigoTipoCredito;
    }

    public Integer getCodigoClaseCredito() {
        return codigoClaseCredito;
    }

    public void setCodigoClaseCredito(Integer codigoClaseCredito) {
        this.codigoClaseCredito = codigoClaseCredito;
    }

    public Integer getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }

    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public Integer getCodigoSituaOperacion() {
        return codigoSituaOperacion;
    }

    public void setCodigoSituaOperacion(Integer codigoSituaOperacion) {
        this.codigoSituaOperacion = codigoSituaOperacion;
    }

    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public Integer getCodigoDestFinOperacion() {
        return codigoDestFinOperacion;
    }

    public void setCodigoDestFinOperacion(Integer codigoDestFinOperacion) {
        this.codigoDestFinOperacion = codigoDestFinOperacion;
    }

    public Integer getCodigoActividadEconoReceptora() {
        return codigoActividadEconoReceptora;
    }

    public void setCodigoActividadEconoReceptora(Integer codigoActividadEconoReceptora) {
        this.codigoActividadEconoReceptora = codigoActividadEconoReceptora;
    }

    public Integer getCodigoDestinoGeograficaPais() {
        return codigoDestinoGeograficaPais;
    }

    public void setCodigoDestinoGeograficaPais(Integer codigoDestinoGeograficaPais) {
        this.codigoDestinoGeograficaPais = codigoDestinoGeograficaPais;
    }

    public Integer getCodigoDestinoGeograficaProvincia() {
        return codigoDestinoGeograficaProvincia;
    }

    public void setCodigoDestinoGeograficaProvincia(Integer codigoDestinoGeograficaProvincia) {
        this.codigoDestinoGeograficaProvincia = codigoDestinoGeograficaProvincia;
    }

    public Integer getCodigoDestinoGeograficaCanton() {
        return codigoDestinoGeograficaCanton;
    }

    public void setCodigoDestinoGeograficaCanton(Integer codigoDestinoGeograficaCanton) {
        this.codigoDestinoGeograficaCanton = codigoDestinoGeograficaCanton;
    }

    public Integer getCodigoDestinoGeograficaParroquia() {
        return codigoDestinoGeograficaParroquia;
    }

    public void setCodigoDestinoGeograficaParroquia(Integer codigoDestinoGeograficaParroquia) {
        this.codigoDestinoGeograficaParroquia = codigoDestinoGeograficaParroquia;
    }

    public BigDecimal getTotalIngreso() {
        return totalIngreso;
    }

    public void setTotalIngreso(BigDecimal totalIngreso) {
        this.totalIngreso = totalIngreso;
    }

    public BigDecimal getTotalEgreso() {
        return totalEgreso;
    }

    public void setTotalEgreso(BigDecimal totalEgreso) {
        this.totalEgreso = totalEgreso;
    }

    public Integer getCodigoNivEstudioEsperado() {
        return codigoNivEstudioEsperado;
    }

    public void setCodigoNivEstudioEsperado(Integer codigoNivEstudioEsperado) {
        this.codigoNivEstudioEsperado = codigoNivEstudioEsperado;
    }

    public Integer getNumEmpleadosMant() {
        return numEmpleadosMant;
    }

    public void setNumEmpleadosMant(Integer numEmpleadosMant) {
        this.numEmpleadosMant = numEmpleadosMant;
    }

    public Integer getNumEmpleadosIncrement() {
        return numEmpleadosIncrement;
    }

    public void setNumEmpleadosIncrement(Integer numEmpleadosIncrement) {
        this.numEmpleadosIncrement = numEmpleadosIncrement;
    }

    public BigDecimal getProduccionActual() {
        return produccionActual;
    }

    public void setProduccionActual(BigDecimal produccionActual) {
        this.produccionActual = produccionActual;
    }

    public BigDecimal getIncrementActualEspe() {
        return incrementActualEspe;
    }

    public void setIncrementActualEspe(BigDecimal incrementActualEspe) {
        this.incrementActualEspe = incrementActualEspe;
    }

    public BigDecimal getMantenerProduccionExportable() {
        return mantenerProduccionExportable;
    }

    public void setMantenerProduccionExportable(BigDecimal mantenerProduccionExportable) {
        this.mantenerProduccionExportable = mantenerProduccionExportable;
    }

    public BigDecimal getIncrementoProduccionExportable() {
        return incrementoProduccionExportable;
    }

    public void setIncrementoProduccionExportable(BigDecimal incrementoProduccionExportable) {
        this.incrementoProduccionExportable = incrementoProduccionExportable;
    }

    public BigDecimal getContribucFbk() {
        return contribucFbk;
    }

    public void setContribucFbk(BigDecimal contribucFbk) {
        this.contribucFbk = contribucFbk;
    }

    public BigDecimal getIncremnetoInvFbk() {
        return incremnetoInvFbk;
    }

    public void setIncremnetoInvFbk(BigDecimal incremnetoInvFbk) {
        this.incremnetoInvFbk = incremnetoInvFbk;
    }

    public BigDecimal getContribucionIntCancer() {
        return contribucionIntCancer;
    }

    public void setContribucionIntCancer(BigDecimal contribucionIntCancer) {
        this.contribucionIntCancer = contribucionIntCancer;
    }

    public Integer getDestiCredInmuebles() {
        return destiCredInmuebles;
    }

    public void setDestiCredInmuebles(Integer destiCredInmuebles) {
        this.destiCredInmuebles = destiCredInmuebles;
    }

    public BigDecimal getValorComercialInm() {
        return valorComercialInm;
    }

    public void setValorComercialInm(BigDecimal valorComercialInm) {
        this.valorComercialInm = valorComercialInm;
    }

    public BigDecimal getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(BigDecimal metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getNumeroTotalPersonaAportan() {
        return numeroTotalPersonaAportan;
    }

    public void setNumeroTotalPersonaAportan(Integer numeroTotalPersonaAportan) {
        this.numeroTotalPersonaAportan = numeroTotalPersonaAportan;
    }
}
