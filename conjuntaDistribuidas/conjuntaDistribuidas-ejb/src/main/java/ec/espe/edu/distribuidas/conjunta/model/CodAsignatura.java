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
class CodAsignatura {

    @Column(name = "PARALELO", nullable = false, length = 1)
    private String codigoParalelo;

    @Column(name = "ALUMNOS", nullable = false)
    private Integer alumnos;

    public CodAsignatura() {
    }

    public CodAsignatura(String codigoParalelo, Integer alumnos) {
        this.codigoParalelo = codigoParalelo;
        this.alumnos = alumnos;
    }

    public String getCodigoParalelo() {
        return codigoParalelo;
    }

    public void setCodigoParalelo(String codigoParalelo) {
        this.codigoParalelo = codigoParalelo;
    }

    public Integer getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Integer alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigoParalelo);
        hash = 97 * hash + Objects.hashCode(this.alumnos);
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
        final CodAsignatura other = (CodAsignatura) obj;
        if (!Objects.equals(this.codigoParalelo, other.codigoParalelo)) {
            return false;
        }
        if (!Objects.equals(this.alumnos, other.alumnos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CodAsignatura{" + "codigoParalelo=" + codigoParalelo + ", alumnos=" + alumnos + '}';
    }

}
