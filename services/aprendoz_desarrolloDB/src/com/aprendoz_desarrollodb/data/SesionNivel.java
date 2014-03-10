
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.SesionNivel
 *  01/24/2014 10:11:19
 * 
 */
public class SesionNivel {

    private Integer idSesionNivel;
    private Nivel nivel;
    private Sy sy;
    private Integer numeroSesion;
    private Date horaInicio;
    private Date horaFin;
    private Integer dia;

    public Integer getIdSesionNivel() {
        return idSesionNivel;
    }

    public void setIdSesionNivel(Integer idSesionNivel) {
        this.idSesionNivel = idSesionNivel;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

    public Integer getNumeroSesion() {
        return numeroSesion;
    }

    public void setNumeroSesion(Integer numeroSesion) {
        this.numeroSesion = numeroSesion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

}
