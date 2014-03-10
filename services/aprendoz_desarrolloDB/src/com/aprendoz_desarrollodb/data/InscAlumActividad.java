
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.InscAlumActividad
 *  01/24/2014 10:11:19
 * 
 */
public class InscAlumActividad {

    private Integer idInscAlumActividad;
    private Actividad actividad;
    private Persona persona;
    private Boolean logrado;
    private Date fecha;
    private String comentario;

    public Integer getIdInscAlumActividad() {
        return idInscAlumActividad;
    }

    public void setIdInscAlumActividad(Integer idInscAlumActividad) {
        this.idInscAlumActividad = idInscAlumActividad;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Boolean getLogrado() {
        return logrado;
    }

    public void setLogrado(Boolean logrado) {
        this.logrado = logrado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
