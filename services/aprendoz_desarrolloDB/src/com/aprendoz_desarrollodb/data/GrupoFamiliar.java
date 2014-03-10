
package com.aprendoz_desarrollodb.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.GrupoFamiliar
 *  01/24/2014 10:11:19
 * 
 */
public class GrupoFamiliar {

    private Integer idGrupoFamiliar;
    private String grupoFamiliar;
    private String grupoLdap;
    private Set<com.aprendoz_desarrollodb.data.TransporteRutas> transporteRutases = new HashSet<com.aprendoz_desarrollodb.data.TransporteRutas>();
    private Set<com.aprendoz_desarrollodb.data.Persona> personas = new HashSet<com.aprendoz_desarrollodb.data.Persona>();
    private Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> inscPersonaGrupoFamiliars = new HashSet<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar>();
    private Set<com.aprendoz_desarrollodb.data.ActualizacionGrupoFamiliar> actualizacionGrupoFamiliars = new HashSet<com.aprendoz_desarrollodb.data.ActualizacionGrupoFamiliar>();

    public Integer getIdGrupoFamiliar() {
        return idGrupoFamiliar;
    }

    public void setIdGrupoFamiliar(Integer idGrupoFamiliar) {
        this.idGrupoFamiliar = idGrupoFamiliar;
    }

    public String getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(String grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public String getGrupoLdap() {
        return grupoLdap;
    }

    public void setGrupoLdap(String grupoLdap) {
        this.grupoLdap = grupoLdap;
    }

    public Set<com.aprendoz_desarrollodb.data.TransporteRutas> getTransporteRutases() {
        return transporteRutases;
    }

    public void setTransporteRutases(Set<com.aprendoz_desarrollodb.data.TransporteRutas> transporteRutases) {
        this.transporteRutases = transporteRutases;
    }

    public Set<com.aprendoz_desarrollodb.data.Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<com.aprendoz_desarrollodb.data.Persona> personas) {
        this.personas = personas;
    }

    public Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> getInscPersonaGrupoFamiliars() {
        return inscPersonaGrupoFamiliars;
    }

    public void setInscPersonaGrupoFamiliars(Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> inscPersonaGrupoFamiliars) {
        this.inscPersonaGrupoFamiliars = inscPersonaGrupoFamiliars;
    }

    public Set<com.aprendoz_desarrollodb.data.ActualizacionGrupoFamiliar> getActualizacionGrupoFamiliars() {
        return actualizacionGrupoFamiliars;
    }

    public void setActualizacionGrupoFamiliars(Set<com.aprendoz_desarrollodb.data.ActualizacionGrupoFamiliar> actualizacionGrupoFamiliars) {
        this.actualizacionGrupoFamiliars = actualizacionGrupoFamiliars;
    }

}
