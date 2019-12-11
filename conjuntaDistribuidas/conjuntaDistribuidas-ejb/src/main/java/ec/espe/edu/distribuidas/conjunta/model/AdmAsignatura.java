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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jaant
 */
@Entity
@Table(name = "ADM_ASIGNATURA")
class AdmAsignatura implements Serializable{
    
    @Id
    @Column(name = "COD_ASIGNATURA", nullable = false)
    private String codigo;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "CREDITOS", nullable = false)
    private Integer creditos;

    @OneToMany(mappedBy = "codigoAsignatura", fetch = FetchType.LAZY)
    private List<AdmAsignatParalelo> admAsignatParalelo;

    public AdmAsignatura() {
    }

    public AdmAsignatura(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public List<AdmAsignatParalelo> getAdmAsignatParalelo() {
        return admAsignatParalelo;
    }

    public void setAdmAsignatParalelo(List<AdmAsignatParalelo> admAsignatParalelo) {
        this.admAsignatParalelo = admAsignatParalelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final AdmAsignatura other = (AdmAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", admAsignatParalelo=" + admAsignatParalelo + '}';
    }
    
    
}
