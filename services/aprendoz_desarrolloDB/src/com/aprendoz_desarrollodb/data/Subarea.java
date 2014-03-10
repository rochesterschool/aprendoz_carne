
package com.aprendoz_desarrollodb.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.Subarea
 *  01/24/2014 10:11:19
 * 
 */
public class Subarea {

    private Integer idSubarea;
    private Area area;
    private String subarea;
    private Integer idSyIdIdSy;
    private Set<com.aprendoz_desarrollodb.data.Eje> ejes = new HashSet<com.aprendoz_desarrollodb.data.Eje>();

    public Integer getIdSubarea() {
        return idSubarea;
    }

    public void setIdSubarea(Integer idSubarea) {
        this.idSubarea = idSubarea;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public Integer getIdSyIdIdSy() {
        return idSyIdIdSy;
    }

    public void setIdSyIdIdSy(Integer idSyIdIdSy) {
        this.idSyIdIdSy = idSyIdIdSy;
    }

    public Set<com.aprendoz_desarrollodb.data.Eje> getEjes() {
        return ejes;
    }

    public void setEjes(Set<com.aprendoz_desarrollodb.data.Eje> ejes) {
        this.ejes = ejes;
    }

}
