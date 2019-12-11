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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author jaant
 */
@Entity
@Table(name = "ADM_EDIFICIO")
public class AdmEdificio implements Serializable {

    @EmbeddedId
    private CodSedePK pk;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "LATITUD", nullable = false)
    private Integer latitud;

    @Column(name = "LONGITUD", nullable = false)
    private Integer longitud;

    @OneToMany(mappedBy = "codigoAdmSede", fetch = FetchType.LAZY)
    private List<AdmEdificio> codigoAdmSede;

    @PrimaryKeyJoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmSede codPaisSede;

    public AdmEdificio() {
    }

    public AdmEdificio(String codigo, String nivel) {
        this.pk = new CodSedePK(codigo, nivel);
    }

    public CodSedePK getPk() {
        return pk;
    }

    public void setPk(CodSedePK pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public List<AdmEdificio> getCodigoAdmSede() {
        return codigoAdmSede;
    }

    public void setCodigoAdmSede(List<AdmEdificio> codigoAdmSede) {
        this.codigoAdmSede = codigoAdmSede;
    }

    public AdmSede getCodPaisSede() {
        return codPaisSede;
    }

    public void setCodPaisSede(AdmSede codPaisSede) {
        this.codPaisSede = codPaisSede;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.pk);
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
        final AdmEdificio other = (AdmEdificio) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificio{" + "pk=" + pk + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", codigoAdmSede=" + codigoAdmSede + ", codPaisSede=" + codPaisSede + '}';
    }

}
