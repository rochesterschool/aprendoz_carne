
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.Semana
 *  01/24/2014 10:11:19
 * 
 */
public class Semana {

    private Integer idSemana;
    private Sy sy;
    private TipoSemana tipoSemana;
    private Integer numeroSemana;

    public Integer getIdSemana() {
        return idSemana;
    }

    public void setIdSemana(Integer idSemana) {
        this.idSemana = idSemana;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

    public TipoSemana getTipoSemana() {
        return tipoSemana;
    }

    public void setTipoSemana(TipoSemana tipoSemana) {
        this.tipoSemana = tipoSemana;
    }

    public Integer getNumeroSemana() {
        return numeroSemana;
    }

    public void setNumeroSemana(Integer numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

}
