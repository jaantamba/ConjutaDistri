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
@Table(name = "ADM_SEDE")
public class AdmSede implements Serializable {

    @Id
    @Column(name = "COD_SEDE", nullable = false, length = 10)
    private String codigo;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false, length = 200)
    private String direccion;

    @OneToMany(mappedBy = "codPaisSede", fetch = FetchType.LAZY)
    private List<AdmEdificio> admEdificio;

    @OneToMany(mappedBy = "codPaisSede", fetch = FetchType.LAZY)
    private List<AdmAula> admAula;

    public AdmSede() {
    }

    public AdmSede(String codigo) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<AdmEdificio> getAdmEdificio() {
        return admEdificio;
    }

    public void setAdmEdificio(List<AdmEdificio> admEdificio) {
        this.admEdificio = admEdificio;
    }

    public List<AdmAula> getAdmAula() {
        return admAula;
    }

    public void setAdmAula(List<AdmAula> admAula) {
        this.admAula = admAula;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final AdmSede other = (AdmSede) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmSede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }

}
