/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jaant
 */
@Entity
@Table(name = "ADM_ASIGNAT_PARAL_HORARIO")
public class AdmAsignatParalHorario implements Serializable {

    @EmbeddedId
    private CodAdmAsignatParalHorario pk;

    @Column(name = "HORA_INICIO", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaInicio;

    @Column(name = "HORA_FIN", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaFin;

    @Column(name = "HORAS", nullable = false)
    private Integer longitud;

    @JoinColumns({
        @JoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
        ,
        @JoinColumn(name = "PARALELO", referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsignatParalelo admAsignaturaParalelo;

    public AdmAsignatParalHorario() {
    }

    public AdmAsignatParalHorario(String paralelo, Integer codigoAsignatura, AdmSede codigoAula, String codigoDia) {
        this.pk = new CodAdmAsignatParalHorario(paralelo, codigoAsignatura, codigoAula, codigoDia);
    }

    public CodAdmAsignatParalHorario getPk() {
        return pk;
    }

    public void setPk(CodAdmAsignatParalHorario pk) {
        this.pk = pk;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public AdmAsignatParalelo getAdmAsignaturaParalelo() {
        return admAsignaturaParalelo;
    }

    public void setAdmAsignaturaParalelo(AdmAsignatParalelo admAsignaturaParalelo) {
        this.admAsignaturaParalelo = admAsignaturaParalelo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignatParalHorario other = (AdmAsignatParalHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorario{" + "pk=" + pk + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", longitud=" + longitud + ", admAsignaturaParalelo=" + admAsignaturaParalelo + '}';
    }

}
