/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.model;

import static ec.espe.edu.distribuidas.conjunta.model.AdmAsignatParalHorario_.admAsignaturaParalelo;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author jaant
 */
@Embeddable
class CodAdmAsignatParalHorario {

    @Column(name = "PARALELO", nullable = false, length = 1)
    private String paralelo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ASIGNATURA")
    private Integer codigoAsignatura;

    @PrimaryKeyJoinColumn(name = "COD_AULA", referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmSede codigoAula;

    @Column(name = "DIA", nullable = false, length = 3)
    private String codigoDia;

    public CodAdmAsignatParalHorario() {
    }

    public CodAdmAsignatParalHorario(String paralelo, Integer codigoAsignatura, AdmSede codigoAula, String codigoDia) {
        this.paralelo = paralelo;
        this.codigoAsignatura = codigoAsignatura;
        this.codigoAula = codigoAula;
        this.codigoDia = codigoDia;
    }

    public Integer getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codigoAsignatura);
        hash = 53 * hash + Objects.hashCode(this.paralelo);
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
        final CodAdmAsignatParalHorario other = (CodAdmAsignatParalHorario) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsignatura, other.codigoAsignatura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CodAdmAsignatParalHorario{" + "codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + ", admAsignaturaParalelo=" + admAsignaturaParalelo + '}';
    }

}
