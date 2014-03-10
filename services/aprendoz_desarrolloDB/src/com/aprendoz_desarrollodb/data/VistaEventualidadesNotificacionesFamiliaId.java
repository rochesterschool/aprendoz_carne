
package com.aprendoz_desarrollodb.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  aprendoz_desarrolloDB.VistaEventualidadesNotificacionesFamiliaId
 *  01/24/2014 10:11:19
 * 
 */
public class VistaEventualidadesNotificacionesFamiliaId
    implements Serializable
{

    private String grupofamiliar;
    private Integer idpersona;
    private String nombreAlumno;
    private Integer idcurso;
    private String curso;
    private String nombrePadre;
    private String correoPadre;
    private String nombreMadre;
    private String correoMadre;
    private String userCordinador;
    private String correoCordinador;
    private Integer ideventualidad;
    private Date fecha;
    private Date horas;
    private String lugar;
    private String tipoeventualidad;
    private String subtipo;
    private String estado;
    private String registrante;
    private String nivel;
    private String correoDirector;
    private String userDirector;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VistaEventualidadesNotificacionesFamiliaId)) {
            return false;
        }
        VistaEventualidadesNotificacionesFamiliaId other = ((VistaEventualidadesNotificacionesFamiliaId) o);
        if (this.grupofamiliar == null) {
            if (other.grupofamiliar!= null) {
                return false;
            }
        } else {
            if (!this.grupofamiliar.equals(other.grupofamiliar)) {
                return false;
            }
        }
        if (this.idpersona == null) {
            if (other.idpersona!= null) {
                return false;
            }
        } else {
            if (!this.idpersona.equals(other.idpersona)) {
                return false;
            }
        }
        if (this.nombreAlumno == null) {
            if (other.nombreAlumno!= null) {
                return false;
            }
        } else {
            if (!this.nombreAlumno.equals(other.nombreAlumno)) {
                return false;
            }
        }
        if (this.idcurso == null) {
            if (other.idcurso!= null) {
                return false;
            }
        } else {
            if (!this.idcurso.equals(other.idcurso)) {
                return false;
            }
        }
        if (this.curso == null) {
            if (other.curso!= null) {
                return false;
            }
        } else {
            if (!this.curso.equals(other.curso)) {
                return false;
            }
        }
        if (this.nombrePadre == null) {
            if (other.nombrePadre!= null) {
                return false;
            }
        } else {
            if (!this.nombrePadre.equals(other.nombrePadre)) {
                return false;
            }
        }
        if (this.correoPadre == null) {
            if (other.correoPadre!= null) {
                return false;
            }
        } else {
            if (!this.correoPadre.equals(other.correoPadre)) {
                return false;
            }
        }
        if (this.nombreMadre == null) {
            if (other.nombreMadre!= null) {
                return false;
            }
        } else {
            if (!this.nombreMadre.equals(other.nombreMadre)) {
                return false;
            }
        }
        if (this.correoMadre == null) {
            if (other.correoMadre!= null) {
                return false;
            }
        } else {
            if (!this.correoMadre.equals(other.correoMadre)) {
                return false;
            }
        }
        if (this.userCordinador == null) {
            if (other.userCordinador!= null) {
                return false;
            }
        } else {
            if (!this.userCordinador.equals(other.userCordinador)) {
                return false;
            }
        }
        if (this.correoCordinador == null) {
            if (other.correoCordinador!= null) {
                return false;
            }
        } else {
            if (!this.correoCordinador.equals(other.correoCordinador)) {
                return false;
            }
        }
        if (this.ideventualidad == null) {
            if (other.ideventualidad!= null) {
                return false;
            }
        } else {
            if (!this.ideventualidad.equals(other.ideventualidad)) {
                return false;
            }
        }
        if (this.fecha == null) {
            if (other.fecha!= null) {
                return false;
            }
        } else {
            if (!this.fecha.equals(other.fecha)) {
                return false;
            }
        }
        if (this.horas == null) {
            if (other.horas!= null) {
                return false;
            }
        } else {
            if (!this.horas.equals(other.horas)) {
                return false;
            }
        }
        if (this.lugar == null) {
            if (other.lugar!= null) {
                return false;
            }
        } else {
            if (!this.lugar.equals(other.lugar)) {
                return false;
            }
        }
        if (this.tipoeventualidad == null) {
            if (other.tipoeventualidad!= null) {
                return false;
            }
        } else {
            if (!this.tipoeventualidad.equals(other.tipoeventualidad)) {
                return false;
            }
        }
        if (this.subtipo == null) {
            if (other.subtipo!= null) {
                return false;
            }
        } else {
            if (!this.subtipo.equals(other.subtipo)) {
                return false;
            }
        }
        if (this.estado == null) {
            if (other.estado!= null) {
                return false;
            }
        } else {
            if (!this.estado.equals(other.estado)) {
                return false;
            }
        }
        if (this.registrante == null) {
            if (other.registrante!= null) {
                return false;
            }
        } else {
            if (!this.registrante.equals(other.registrante)) {
                return false;
            }
        }
        if (this.nivel == null) {
            if (other.nivel!= null) {
                return false;
            }
        } else {
            if (!this.nivel.equals(other.nivel)) {
                return false;
            }
        }
        if (this.correoDirector == null) {
            if (other.correoDirector!= null) {
                return false;
            }
        } else {
            if (!this.correoDirector.equals(other.correoDirector)) {
                return false;
            }
        }
        if (this.userDirector == null) {
            if (other.userDirector!= null) {
                return false;
            }
        } else {
            if (!this.userDirector.equals(other.userDirector)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.grupofamiliar!= null) {
            rtn = (rtn + this.grupofamiliar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.idpersona!= null) {
            rtn = (rtn + this.idpersona.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombreAlumno!= null) {
            rtn = (rtn + this.nombreAlumno.hashCode());
        }
        rtn = (rtn* 37);
        if (this.idcurso!= null) {
            rtn = (rtn + this.idcurso.hashCode());
        }
        rtn = (rtn* 37);
        if (this.curso!= null) {
            rtn = (rtn + this.curso.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombrePadre!= null) {
            rtn = (rtn + this.nombrePadre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoPadre!= null) {
            rtn = (rtn + this.correoPadre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombreMadre!= null) {
            rtn = (rtn + this.nombreMadre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoMadre!= null) {
            rtn = (rtn + this.correoMadre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.userCordinador!= null) {
            rtn = (rtn + this.userCordinador.hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoCordinador!= null) {
            rtn = (rtn + this.correoCordinador.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ideventualidad!= null) {
            rtn = (rtn + this.ideventualidad.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fecha!= null) {
            rtn = (rtn + this.fecha.hashCode());
        }
        rtn = (rtn* 37);
        if (this.horas!= null) {
            rtn = (rtn + this.horas.hashCode());
        }
        rtn = (rtn* 37);
        if (this.lugar!= null) {
            rtn = (rtn + this.lugar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tipoeventualidad!= null) {
            rtn = (rtn + this.tipoeventualidad.hashCode());
        }
        rtn = (rtn* 37);
        if (this.subtipo!= null) {
            rtn = (rtn + this.subtipo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.estado!= null) {
            rtn = (rtn + this.estado.hashCode());
        }
        rtn = (rtn* 37);
        if (this.registrante!= null) {
            rtn = (rtn + this.registrante.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nivel!= null) {
            rtn = (rtn + this.nivel.hashCode());
        }
        rtn = (rtn* 37);
        if (this.correoDirector!= null) {
            rtn = (rtn + this.correoDirector.hashCode());
        }
        rtn = (rtn* 37);
        if (this.userDirector!= null) {
            rtn = (rtn + this.userDirector.hashCode());
        }
        return rtn;
    }

    public String getGrupofamiliar() {
        return grupofamiliar;
    }

    public void setGrupofamiliar(String grupofamiliar) {
        this.grupofamiliar = grupofamiliar;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getCorreoPadre() {
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        this.correoPadre = correoPadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getCorreoMadre() {
        return correoMadre;
    }

    public void setCorreoMadre(String correoMadre) {
        this.correoMadre = correoMadre;
    }

    public String getUserCordinador() {
        return userCordinador;
    }

    public void setUserCordinador(String userCordinador) {
        this.userCordinador = userCordinador;
    }

    public String getCorreoCordinador() {
        return correoCordinador;
    }

    public void setCorreoCordinador(String correoCordinador) {
        this.correoCordinador = correoCordinador;
    }

    public Integer getIdeventualidad() {
        return ideventualidad;
    }

    public void setIdeventualidad(Integer ideventualidad) {
        this.ideventualidad = ideventualidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoeventualidad() {
        return tipoeventualidad;
    }

    public void setTipoeventualidad(String tipoeventualidad) {
        this.tipoeventualidad = tipoeventualidad;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegistrante() {
        return registrante;
    }

    public void setRegistrante(String registrante) {
        this.registrante = registrante;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCorreoDirector() {
        return correoDirector;
    }

    public void setCorreoDirector(String correoDirector) {
        this.correoDirector = correoDirector;
    }

    public String getUserDirector() {
        return userDirector;
    }

    public void setUserDirector(String userDirector) {
        this.userDirector = userDirector;
    }

}
