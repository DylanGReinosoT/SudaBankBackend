package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;

@Entity
@Table(name = "NESR12")
public class R12Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "NOMBRE_GRUPO_ECONOMICO")
    private String nombreGrupoEconomico;


    @Column(name = "IDENTIFICACION_INTEGRANTE")
    private String identificacionIntegrante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreGrupoEconomico() {
        return nombreGrupoEconomico;
    }

    public void setNombreGrupoEconomico(String nombreGrupoEconomico) {
        this.nombreGrupoEconomico = nombreGrupoEconomico;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionIntegrante() {
        return identificacionIntegrante;
    }

    public void setIdentificacionIntegrante(String identificacionIntegrante) {
        this.identificacionIntegrante = identificacionIntegrante;
    }
}

