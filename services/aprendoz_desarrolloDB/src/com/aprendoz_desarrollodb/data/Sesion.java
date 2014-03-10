
package com.aprendoz_desarrollodb.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.Sesion
 *  01/24/2014 10:11:19
 * 
 */
public class Sesion {

    private Integer idSesion;
    private Curso curso;
    private Asignatura asignatura;
    private Date fecha;
    private Integer numeroSesion;
    private Boolean impartida;
    private String comentario;
    private Date horaInicio;
    private Date horaFin;
    private Set<com.aprendoz_desarrollodb.data.Asistencia> asistencias = new HashSet<com.aprendoz_desarrollodb.data.Asistencia>();

    public Integer getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNumeroSesion() {
        return numeroSesion;
    }

    public void setNumeroSesion(Integer numeroSesion) {
        this.numeroSesion = numeroSesion;
    }

    public Boolean getImpartida() {
        return impartida;
    }

    public void setImpartida(Boolean impartida) {
        this.impartida = impartida;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Set<com.aprendoz_desarrollodb.data.Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Set<com.aprendoz_desarrollodb.data.Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

}
