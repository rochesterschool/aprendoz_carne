
package com.aprendoz_desarrollodb.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.Aprendizaje
 *  01/24/2014 10:11:19
 * 
 */
public class Aprendizaje {

    private Integer idAprendizaje;
    private Inteligencia inteligencia;
    private DimensionComprension dimensionComprension;
    private Subtopico subtopico;
    private NivelEsperado nivelEsperado;
    private DimensionCurricular dimensionCurricular;
    private Date fechaEsperada;
    private String aprendizaje;
    private String learning;
    private Integer peso;
    private Integer ejeIdEje;
    private Integer eje2IdEje;
    private Integer eje3IdEje;
    private Set<com.aprendoz_desarrollodb.data.CalificacionFinal> calificacionFinals = new HashSet<com.aprendoz_desarrollodb.data.CalificacionFinal>();
    private Set<com.aprendoz_desarrollodb.data.InscAlumAprendizaje> inscAlumAprendizajes = new HashSet<com.aprendoz_desarrollodb.data.InscAlumAprendizaje>();

    public Integer getIdAprendizaje() {
        return idAprendizaje;
    }

    public void setIdAprendizaje(Integer idAprendizaje) {
        this.idAprendizaje = idAprendizaje;
    }

    public Inteligencia getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Inteligencia inteligencia) {
        this.inteligencia = inteligencia;
    }

    public DimensionComprension getDimensionComprension() {
        return dimensionComprension;
    }

    public void setDimensionComprension(DimensionComprension dimensionComprension) {
        this.dimensionComprension = dimensionComprension;
    }

    public Subtopico getSubtopico() {
        return subtopico;
    }

    public void setSubtopico(Subtopico subtopico) {
        this.subtopico = subtopico;
    }

    public NivelEsperado getNivelEsperado() {
        return nivelEsperado;
    }

    public void setNivelEsperado(NivelEsperado nivelEsperado) {
        this.nivelEsperado = nivelEsperado;
    }

    public DimensionCurricular getDimensionCurricular() {
        return dimensionCurricular;
    }

    public void setDimensionCurricular(DimensionCurricular dimensionCurricular) {
        this.dimensionCurricular = dimensionCurricular;
    }

    public Date getFechaEsperada() {
        return fechaEsperada;
    }

    public void setFechaEsperada(Date fechaEsperada) {
        this.fechaEsperada = fechaEsperada;
    }

    public String getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(String aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEjeIdEje() {
        return ejeIdEje;
    }

    public void setEjeIdEje(Integer ejeIdEje) {
        this.ejeIdEje = ejeIdEje;
    }

    public Integer getEje2IdEje() {
        return eje2IdEje;
    }

    public void setEje2IdEje(Integer eje2IdEje) {
        this.eje2IdEje = eje2IdEje;
    }

    public Integer getEje3IdEje() {
        return eje3IdEje;
    }

    public void setEje3IdEje(Integer eje3IdEje) {
        this.eje3IdEje = eje3IdEje;
    }

    public Set<com.aprendoz_desarrollodb.data.CalificacionFinal> getCalificacionFinals() {
        return calificacionFinals;
    }

    public void setCalificacionFinals(Set<com.aprendoz_desarrollodb.data.CalificacionFinal> calificacionFinals) {
        this.calificacionFinals = calificacionFinals;
    }

    public Set<com.aprendoz_desarrollodb.data.InscAlumAprendizaje> getInscAlumAprendizajes() {
        return inscAlumAprendizajes;
    }

    public void setInscAlumAprendizajes(Set<com.aprendoz_desarrollodb.data.InscAlumAprendizaje> inscAlumAprendizajes) {
        this.inscAlumAprendizajes = inscAlumAprendizajes;
    }

}
