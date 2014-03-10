
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.Cronograma
 *  01/24/2014 10:11:19
 * 
 */
public class Cronograma {

    private Integer idCronograma;
    private TipoDia tipoDia;
    private Sy sy;
    private Date fecha;
    private String descripcion;

    public Integer getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(Integer idCronograma) {
        this.idCronograma = idCronograma;
    }

    public TipoDia getTipoDia() {
        return tipoDia;
    }

    public void setTipoDia(TipoDia tipoDia) {
        this.tipoDia = tipoDia;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
