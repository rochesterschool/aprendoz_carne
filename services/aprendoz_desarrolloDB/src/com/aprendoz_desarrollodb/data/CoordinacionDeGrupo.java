
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.CoordinacionDeGrupo
 *  01/24/2014 10:11:19
 * 
 */
public class CoordinacionDeGrupo {

    private Integer idCoordinacionDeGrupo;
    private Curso curso;
    private Sy sy;
    private Persona persona;

    public Integer getIdCoordinacionDeGrupo() {
        return idCoordinacionDeGrupo;
    }

    public void setIdCoordinacionDeGrupo(Integer idCoordinacionDeGrupo) {
        this.idCoordinacionDeGrupo = idCoordinacionDeGrupo;
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

}
