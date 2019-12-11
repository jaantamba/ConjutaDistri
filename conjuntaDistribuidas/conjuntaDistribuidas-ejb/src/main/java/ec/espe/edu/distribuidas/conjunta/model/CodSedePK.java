/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jaant
 */
@Embeddable
class CodSedePK {

    @Column(name = "COD_SEDE", nullable = false, length = 2)
    private String codigo;

    @Column(name = "COD_EDIFICIO", nullable = false, length = 2)
    private String nivel;

    public CodSedePK() {
    }

    public CodSedePK(String codigo, String nivel) {
        this.codigo = codigo;
        this.nivel = nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        hash = 83 * hash + Objects.hashCode(this.nivel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodSedePK other = (CodSedePK) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CodSedePK{" + "codigo=" + codigo + ", nivel=" + nivel + '}';
    }

}
