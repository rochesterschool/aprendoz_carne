
package com.aprendoz_desarrollodb.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.TipoDesempeno
 *  01/24/2014 10:11:19
 * 
 */
public class TipoDesempeno {

    private Integer idTipoDesempeno;
    private String tipoDesempeno;
    private Set<com.aprendoz_desarrollodb.data.Actividad> actividads = new HashSet<com.aprendoz_desarrollodb.data.Actividad>();

    public Integer getIdTipoDesempeno() {
        return idTipoDesempeno;
    }

    public void setIdTipoDesempeno(Integer idTipoDesempeno) {
        this.idTipoDesempeno = idTipoDesempeno;
    }

    public String getTipoDesempeno() {
        return tipoDesempeno;
    }

    public void setTipoDesempeno(String tipoDesempeno) {
        this.tipoDesempeno = tipoDesempeno;
    }

    public Set<com.aprendoz_desarrollodb.data.Actividad> getActividads() {
        return actividads;
    }

    public void setActividads(Set<com.aprendoz_desarrollodb.data.Actividad> actividads) {
        this.actividads = actividads;
    }

}
