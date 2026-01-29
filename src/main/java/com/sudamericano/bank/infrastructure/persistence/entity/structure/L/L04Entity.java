package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "NESL04")
public class L04Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "CODIGO_EMISOR")
    private Integer codigoEmisor;

    @Column(name = "NUMERO_TITULO")
    private String numeroTitulo;

    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @Column(name = "FECHA_COMPRA")
    private LocalDate fechaCompra;

    @Column(name = "CUENTA_ORIGEN")
    private Integer cuentaOrigen;

    @Column(name = "CUENTA_DESTINO")
    private Integer cuentaDestino;

    @Column(name = "VALOR_LIBROS_CUENTA_ORIGEN")
    private Float valorLibrosCuentaOrigen;

    @Column(name = "VALOR_LIBROS_CUENTA_DESTINO")
    private Float valorLibrosCuentaDestino;

    @Column(name = "FECHA_TRANSFERENCIA")
    private LocalDate fechaTransferencia;

    @Column(name = "CODIGO_MOTIVO_TRANSFERENCIA")
    private Integer codigoMotivoTransferencia;

    public LocalDate getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(LocalDate fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public Integer getCodigoEmisor() {
        return codigoEmisor;
    }

    public void setCodigoEmisor(Integer codigoEmisor) {
        this.codigoEmisor = codigoEmisor;
    }

    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Integer cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Integer getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Integer cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Float getValorLibrosCuentaOrigen() {
        return valorLibrosCuentaOrigen;
    }

    public void setValorLibrosCuentaOrigen(Float valorLibrosCuentaOrigen) {
        this.valorLibrosCuentaOrigen = valorLibrosCuentaOrigen;
    }

    public Float getValorLibrosCuentaDestino() {
        return valorLibrosCuentaDestino;
    }

    public void setValorLibrosCuentaDestino(Float valorLibrosCuentaDestino) {
        this.valorLibrosCuentaDestino = valorLibrosCuentaDestino;
    }

    public Integer getCodigoMotivoTransferencia() {
        return codigoMotivoTransferencia;
    }

    public void setCodigoMotivoTransferencia(Integer codigoMotivoTransferencia) {
        this.codigoMotivoTransferencia = codigoMotivoTransferencia;
    }


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

}
