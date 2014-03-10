
package com.aprendoz_desarrollodb.data;

import java.util.Date;


/**
 *  aprendoz_desarrolloDB.InscAlumCurso
 *  01/24/2014 10:11:19
 * 
 */
public class InscAlumCurso {

    private Integer idInscAlumCurso;
    private Curso curso;
    private Sy sy;
    private Persona persona;
    private Integer calificacion;
    private String califChar;
    private Date fechaMatricula;

    public Integer getIdInscAlumCurso() {
        return idInscAlumCurso;
    }

    public void setIdInscAlumCurso(Integer idInscAlumCurso) {
        this.idInscAlumCurso = idInscAlumCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getCalifChar() {
        return califChar;
    }

    public void setCalifChar(String califChar) {
        this.califChar = califChar;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

}
