
package com.aprendoz_desarrollodb.data;

import java.io.Serializable;


/**
 *  aprendoz_desarrolloDB.CoordinadoresId
 *  01/24/2014 10:11:19
 * 
 */
public class CoordinadoresId
    implements Serializable
{

    private Integer idCoordinador;
    private Integer personaIdPersona;
    private Integer cursoIdCurso;
    private String grupo;
    private Integer syIdSy;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoordinadoresId)) {
            return false;
        }
        CoordinadoresId other = ((CoordinadoresId) o);
        if (this.idCoordinador == null) {
            if (other.idCoordinador!= null) {
                return false;
            }
        } else {
            if (!this.idCoordinador.equals(other.idCoordinador)) {
                return false;
            }
        }
        if (this.personaIdPersona == null) {
            if (other.personaIdPersona!= null) {
                return false;
            }
        } else {
            if (!this.personaIdPersona.equals(other.personaIdPersona)) {
                return false;
            }
        }
        if (this.cursoIdCurso == null) {
            if (other.cursoIdCurso!= null) {
                return false;
            }
        } else {
            if (!this.cursoIdCurso.equals(other.cursoIdCurso)) {
                return false;
            }
        }
        if (this.grupo == null) {
            if (other.grupo!= null) {
                return false;
            }
        } else {
            if (!this.grupo.equals(other.grupo)) {
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
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.idCoordinador!= null) {
            rtn = (rtn + this.idCoordinador.hashCode());
        }
        rtn = (rtn* 37);
        if (this.personaIdPersona!= null) {
            rtn = (rtn + this.personaIdPersona.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cursoIdCurso!= null) {
            rtn = (rtn + this.cursoIdCurso.hashCode());
        }
        rtn = (rtn* 37);
        if (this.grupo!= null) {
            rtn = (rtn + this.grupo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.syIdSy!= null) {
            rtn = (rtn + this.syIdSy.hashCode());
        }
        return rtn;
    }

    public Integer getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(Integer idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    public Integer getPersonaIdPersona() {
        return personaIdPersona;
    }

    public void setPersonaIdPersona(Integer personaIdPersona) {
        this.personaIdPersona = personaIdPersona;
    }

    public Integer getCursoIdCurso() {
        return cursoIdCurso;
    }

    public void setCursoIdCurso(Integer cursoIdCurso) {
        this.cursoIdCurso = cursoIdCurso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getSyIdSy() {
        return syIdSy;
    }

    public void setSyIdSy(Integer syIdSy) {
        this.syIdSy = syIdSy;
    }

}
