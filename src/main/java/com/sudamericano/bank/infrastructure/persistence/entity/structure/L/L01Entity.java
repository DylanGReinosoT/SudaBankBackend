package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

@Entity
@Table(name = "NESL01")
public class L01Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "CODIGO_EMISOR")
    private Integer codigoEmisor;

    @Column(name = "CODIGO_CLASIFICACION_EMISOR")
    private Integer codigoClasificacionEmisor;

    @Column(name = "CODIGO_TIPO_EMISOR")
    private Integer codigoTipoEmisor;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}

	public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}

	public Integer getCodigoEmisor() {
		return codigoEmisor;
	}

	public void setCodigoEmisor(Integer codigoEmisor) {
		this.codigoEmisor = codigoEmisor;
	}

	public Integer getCodigoClasificacionEmisor() {
		return codigoClasificacionEmisor;
	}

	public void setCodigoClasificacionEmisor(Integer codigoClasificacionEmisor) {
		this.codigoClasificacionEmisor = codigoClasificacionEmisor;
	}

	public Integer getCodigoTipoEmisor() {
		return codigoTipoEmisor;
	}

	public void setCodigoTipoEmisor(Integer codigoTipoEmisor) {
		this.codigoTipoEmisor = codigoTipoEmisor;
	}

}
