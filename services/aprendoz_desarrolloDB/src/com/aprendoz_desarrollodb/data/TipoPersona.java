
package com.aprendoz_desarrollodb.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrolloDB.TipoPersona
 *  01/24/2014 10:11:19
 * 
 */
public class TipoPersona {

    private Integer idTipoPersona;
    private String tipoPersona;
    private Set<com.aprendoz_desarrollodb.data.AccAuthorization> accAuthorizations = new HashSet<com.aprendoz_desarrollodb.data.AccAuthorization>();
    private Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> inscPersonaGrupoFamiliars = new HashSet<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar>();
    private Set<com.aprendoz_desarrollodb.data.Persona> personas = new HashSet<com.aprendoz_desarrollodb.data.Persona>();
    private Set<com.aprendoz_desarrollodb.data.ReportesTipoPersona> reportesTipoPersonas = new HashSet<com.aprendoz_desarrollodb.data.ReportesTipoPersona>();

    public Integer getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Set<com.aprendoz_desarrollodb.data.AccAuthorization> getAccAuthorizations() {
        return accAuthorizations;
    }

    public void setAccAuthorizations(Set<com.aprendoz_desarrollodb.data.AccAuthorization> accAuthorizations) {
        this.accAuthorizations = accAuthorizations;
    }

    public Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> getInscPersonaGrupoFamiliars() {
        return inscPersonaGrupoFamiliars;
    }

    public void setInscPersonaGrupoFamiliars(Set<com.aprendoz_desarrollodb.data.InscPersonaGrupoFamiliar> inscPersonaGrupoFamiliars) {
        this.inscPersonaGrupoFamiliars = inscPersonaGrupoFamiliars;
    }

    public Set<com.aprendoz_desarrollodb.data.Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<com.aprendoz_desarrollodb.data.Persona> personas) {
        this.personas = personas;
    }

    public Set<com.aprendoz_desarrollodb.data.ReportesTipoPersona> getReportesTipoPersonas() {
        return reportesTipoPersonas;
    }

    public void setReportesTipoPersonas(Set<com.aprendoz_desarrollodb.data.ReportesTipoPersona> reportesTipoPersonas) {
        this.reportesTipoPersonas = reportesTipoPersonas;
    }

}
