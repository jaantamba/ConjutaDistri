/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author jaant
 */
@Entity
@Table(name = "ADM_ASIGNATURA_PARALELO")
class AdmAsignatParalelo implements Serializable {

    @EmbeddedId
    private CodAsignatura pk;

    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAsignatura codigoAsignatura;

    @OneToMany(mappedBy = "admAsignaturaParalelo", fetch = FetchType.LAZY)
    private List<AdmAsignatura> paralelo;

    public AdmAsignatParalelo() {
    }

    public AdmAsignatParalelo(String codigoParalelo, Integer alumnos) {
        this.pk = new CodAsignatura(codigoParalelo, alumnos);
    }

    public CodAsignatura getPk() {
        return pk;
    }

    public void setPk(CodAsignatura pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AdmAsignatura getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(AdmAsignatura codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public List<AdmAsignatura> getParalelo() {
        return paralelo;
    }

    public void setParalelo(List<AdmAsignatura> paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignatParalelo other = (AdmAsignatParalelo) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalo{" + "pk=" + pk + ", estado=" + estado + ", codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + '}';
    }
    

}
