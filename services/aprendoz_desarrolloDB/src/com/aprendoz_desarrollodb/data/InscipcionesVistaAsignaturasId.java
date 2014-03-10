
package com.aprendoz_desarrollodb.data;

import java.io.Serializable;


/**
 *  aprendoz_desarrolloDB.InscipcionesVistaAsignaturasId
 *  01/24/2014 10:11:19
 * 
 */
public class InscipcionesVistaAsignaturasId
    implements Serializable
{

    private Integer idAsignatura;
    private String asignatura;
    private Integer syIdSy;
    private Integer gradoIdGrado;
    private Boolean electiva;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InscipcionesVistaAsignaturasId)) {
            return false;
        }
        InscipcionesVistaAsignaturasId other = ((InscipcionesVistaAsignaturasId) o);
        if (this.idAsignatura == null) {
            if (other.idAsignatura!= null) {
                return false;
            }
        } else {
            if (!this.idAsignatura.equals(other.idAsignatura)) {
                return false;
            }
        }
        if (this.asignatura == null) {
            if (other.asignatura!= null) {
                return false;
            }
        } else {
            if (!this.asignatura.equals(other.asignatura)) {
                return false;
            }
        }
        if (this.syIdSy == null) {
            if (other.syIdSy!= null) {
                return false;
            }
        } else {
            if (!this.syIdSy.equals(other.syIdSy)) {
                return false;
            }
        }
        if (this.gradoIdGrado == null) {
            if (other.gradoIdGrado!= null) {
                return false;
            }
        } else {
            if (!this.gradoIdGrado.equals(other.gradoIdGrado)) {
                return false;
            }
        }
        if (this.electiva == null) {
            if (other.electiva!= null) {
                return false;
            }
        } else {
            if (!this.electiva.equals(other.electiva)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.idAsignatura!= null) {
            rtn = (rtn + this.idAsignatura.hashCode());
        }
        rtn = (rtn* 37);
        if (this.asignatura!= null) {
            rtn = (rtn + this.asignatura.hashCode());
        }
        rtn = (rtn* 37);
        if (this.syIdSy!= null) {
            rtn = (rtn + this.syIdSy.hashCode());
        }
        rtn = (rtn* 37);
        if (this.gradoIdGrado!= null) {
            rtn = (rtn + this.gradoIdGrado.hashCode());
        }
        rtn = (rtn* 37);
        if (this.electiva!= null) {
            rtn = (rtn + this.electiva.hashCode());
        }
        return rtn;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getSyIdSy() {
        return syIdSy;
    }

    public void setSyIdSy(Integer syIdSy) {
        this.syIdSy = syIdSy;
    }

    public Integer getGradoIdGrado() {
        return gradoIdGrado;
    }

    public void setGradoIdGrado(Integer gradoIdGrado) {
        this.gradoIdGrado = gradoIdGrado;
    }

    public Boolean getElectiva() {
        return electiva;
    }

    public void setElectiva(Boolean electiva) {
        this.electiva = electiva;
    }

}
