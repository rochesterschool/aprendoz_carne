
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.BimestreSy
 *  01/24/2014 10:11:19
 * 
 */
public class BimestreSy {

    private Integer idBimSy;
    private Sy sy;
    private Integer bimestre;
    private Date fechaInicio;
    private Date fechaFin;

    public Integer getIdBimSy() {
        return idBimSy;
    }

    public void setIdBimSy(Integer idBimSy) {
        this.idBimSy = idBimSy;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

    public Integer getBimestre() {
        return bimestre;
    }

    public void setBimestre(Integer bimestre) {
        this.bimestre = bimestre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
