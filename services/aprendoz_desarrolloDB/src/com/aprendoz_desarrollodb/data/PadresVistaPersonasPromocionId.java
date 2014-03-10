
package com.aprendoz_desarrollodb.data;

import java.io.Serializable;


/**
 *  aprendoz_desarrolloDB.PadresVistaPersonasPromocionId
 *  01/24/2014 10:11:19
 * 
 */
public class PadresVistaPersonasPromocionId
    implements Serializable
{

    private Integer idPersona;
    private String codigo;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private Integer grupoFamiliarIdGrupoFamiliar;
    private String grupoFamiliar;
    private Integer idGrupoFamiliar;
    private Integer tipoPersonaIdTipoPersona;
    private Boolean autorizadoFinanciera;
    private Boolean autorizadoAcademico;
    private Boolean aprobado;
    private Boolean promovido;
    private Integer syIdSy;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PadresVistaPersonasPromocionId)) {
            return false;
        }
        PadresVistaPersonasPromocionId other = ((PadresVistaPersonasPromocionId) o);
        if (this.idPersona == null) {
            if (other.idPersona!= null) {
                return false;
            }
        } else {
            if (!this.idPersona.equals(other.idPersona)) {
                return false;
            }
        }
        if (this.codigo == null) {
            if (other.codigo!= null) {
                return false;
            }
        } else {
            if (!this.codigo.equals(other.codigo)) {
                return false;
            }
        }
        if (this.apellido1 == null) {
            if (other.apellido1 != null) {
                return false;
            }
        } else {
            if (!this.apellido1 .equals(other.apellido1)) {
                return false;
            }
        }
        if (this.apellido2 == null) {
            if (other.apellido2 != null) {
                return false;
            }
        } else {
            if (!this.apellido2 .equals(other.apellido2)) {
                return false;
            }
        }
        if (this.nombre1 == null) {
            if (other.nombre1 != null) {
                return false;
            }
        } else {
            if (!this.nombre1 .equals(other.nombre1)) {
                return false;
            }
        }
        if (this.nombre2 == null) {
            if (other.nombre2 != null) {
                return false;
            }
        } else {
            if (!this.nombre2 .equals(other.nombre2)) {
                return false;
            }
        }
        if (this.grupoFamiliarIdGrupoFamiliar == null) {
            if (other.grupoFamiliarIdGrupoFamiliar!= null) {
                return false;
            }
        } else {
            if (!this.grupoFamiliarIdGrupoFamiliar.equals(other.grupoFamiliarIdGrupoFamiliar)) {
                return false;
            }
        }
        if (this.grupoFamiliar == null) {
            if (other.grupoFamiliar!= null) {
                return false;
            }
        } else {
            if (!this.grupoFamiliar.equals(other.grupoFamiliar)) {
                return false;
            }
        }
        if (this.idGrupoFamiliar == null) {
            if (other.idGrupoFamiliar!= null) {
                return false;
            }
        } else {
            if (!this.idGrupoFamiliar.equals(other.idGrupoFamiliar)) {
                return false;
            }
        }
        if (this.tipoPersonaIdTipoPersona == null) {
            if (other.tipoPersonaIdTipoPersona!= null) {
                return false;
            }
        } else {
            if (!this.tipoPersonaIdTipoPersona.equals(other.tipoPersonaIdTipoPersona)) {
                return false;
            }
        }
        if (this.autorizadoFinanciera == null) {
            if (other.autorizadoFinanciera!= null) {
                return false;
            }
        } else {
            if (!this.autorizadoFinanciera.equals(other.autorizadoFinanciera)) {
                return false;
            }
        }
        if (this.autorizadoAcademico == null) {
            if (other.autorizadoAcademico!= null) {
                return false;
            }
        } else {
            if (!this.autorizadoAcademico.equals(other.autorizadoAcademico)) {
                return false;
            }
        }
        if (this.aprobado == null) {
            if (other.aprobado!= null) {
                return false;
            }
        } else {
            if (!this.aprobado.equals(other.aprobado)) {
                return false;
            }
        }
        if (this.promovido == null) {
            if (other.promovido!= null) {
                return false;
            }
        } else {
            if (!this.promovido.equals(other.promovido)) {
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
        if (this.idPersona!= null) {
            rtn = (rtn + this.idPersona.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codigo!= null) {
            rtn = (rtn + this.codigo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.apellido1 != null) {
            rtn = (rtn + this.apellido1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.apellido2 != null) {
            rtn = (rtn + this.apellido2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombre1 != null) {
            rtn = (rtn + this.nombre1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombre2 != null) {
            rtn = (rtn + this.nombre2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.grupoFamiliarIdGrupoFamiliar!= null) {
            rtn = (rtn + this.grupoFamiliarIdGrupoFamiliar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.grupoFamiliar!= null) {
            rtn = (rtn + this.grupoFamiliar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.idGrupoFamiliar!= null) {
            rtn = (rtn + this.idGrupoFamiliar.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tipoPersonaIdTipoPersona!= null) {
            rtn = (rtn + this.tipoPersonaIdTipoPersona.hashCode());
        }
        rtn = (rtn* 37);
        if (this.autorizadoFinanciera!= null) {
            rtn = (rtn + this.autorizadoFinanciera.hashCode());
        }
        rtn = (rtn* 37);
        if (this.autorizadoAcademico!= null) {
            rtn = (rtn + this.autorizadoAcademico.hashCode());
        }
        rtn = (rtn* 37);
        if (this.aprobado!= null) {
            rtn = (rtn + this.aprobado.hashCode());
        }
        rtn = (rtn* 37);
        if (this.promovido!= null) {
            rtn = (rtn + this.promovido.hashCode());
        }
        rtn = (rtn* 37);
        if (this.syIdSy!= null) {
            rtn = (rtn + this.syIdSy.hashCode());
        }
        return rtn;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public Integer getGrupoFamiliarIdGrupoFamiliar() {
        return grupoFamiliarIdGrupoFamiliar;
    }

    public void setGrupoFamiliarIdGrupoFamiliar(Integer grupoFamiliarIdGrupoFamiliar) {
        this.grupoFamiliarIdGrupoFamiliar = grupoFamiliarIdGrupoFamiliar;
    }

    public String getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(String grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public Integer getIdGrupoFamiliar() {
        return idGrupoFamiliar;
    }

    public void setIdGrupoFamiliar(Integer idGrupoFamiliar) {
        this.idGrupoFamiliar = idGrupoFamiliar;
    }

    public Integer getTipoPersonaIdTipoPersona() {
        return tipoPersonaIdTipoPersona;
    }

    public void setTipoPersonaIdTipoPersona(Integer tipoPersonaIdTipoPersona) {
        this.tipoPersonaIdTipoPersona = tipoPersonaIdTipoPersona;
    }

    public Boolean getAutorizadoFinanciera() {
        return autorizadoFinanciera;
    }

    public void setAutorizadoFinanciera(Boolean autorizadoFinanciera) {
        this.autorizadoFinanciera = autorizadoFinanciera;
    }

    public Boolean getAutorizadoAcademico() {
        return autorizadoAcademico;
    }

    public void setAutorizadoAcademico(Boolean autorizadoAcademico) {
        this.autorizadoAcademico = autorizadoAcademico;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Boolean getPromovido() {
        return promovido;
    }

    public void setPromovido(Boolean promovido) {
        this.promovido = promovido;
    }

    public Integer getSyIdSy() {
        return syIdSy;
    }

    public void setSyIdSy(Integer syIdSy) {
        this.syIdSy = syIdSy;
    }

}
