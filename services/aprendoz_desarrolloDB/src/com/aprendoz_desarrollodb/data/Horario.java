
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.Horario
 *  01/24/2014 10:11:19
 * 
 */
public class Horario {

    private Integer idHorario;
    private Curso curso;
    private Asignatura asignatura;
    private Sy sy;
    private TipoSemana tipoSemana;
    private Integer numeroSesion;
    private String dia;

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
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

    public Integer getNumeroSesion() {
        return numeroSesion;
    }

    public void setNumeroSesion(Integer numeroSesion) {
        this.numeroSesion = numeroSesion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
