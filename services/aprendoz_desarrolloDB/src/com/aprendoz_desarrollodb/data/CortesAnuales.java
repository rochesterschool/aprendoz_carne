
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.CortesAnuales
 *  01/24/2014 10:11:19
 * 
 */
public class CortesAnuales {

    private Integer idCorte;
    private Integer numeroCorte;
    private String mescorte;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer syIdSy;
    private String ordenNominal;

    public Integer getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(Integer idCorte) {
        this.idCorte = idCorte;
    }

    public Integer getNumeroCorte() {
        return numeroCorte;
    }

    public void setNumeroCorte(Integer numeroCorte) {
        this.numeroCorte = numeroCorte;
    }

    public String getMescorte() {
        return mescorte;
    }

    public void setMescorte(String mescorte) {
        this.mescorte = mescorte;
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

    public Integer getSyIdSy() {
        return syIdSy;
    }

    public void setSyIdSy(Integer syIdSy) {
        this.syIdSy = syIdSy;
    }

    public String getOrdenNominal() {
        return ordenNominal;
    }

    public void setOrdenNominal(String ordenNominal) {
        this.ordenNominal = ordenNominal;
    }

}
