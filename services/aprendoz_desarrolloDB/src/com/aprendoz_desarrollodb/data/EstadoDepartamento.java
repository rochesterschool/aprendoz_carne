
package com.aprendoz_desarrollodb.data;



/**
 *  aprendoz_desarrolloDB.EstadoDepartamento
 *  01/24/2014 10:11:19
 * 
 */
public class EstadoDepartamento {

    private Integer idEstados;
    private Pais pais;
    private String estado;

    public Integer getIdEstados() {
        return idEstados;
    }

    public void setIdEstados(Integer idEstados) {
        this.idEstados = idEstados;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
