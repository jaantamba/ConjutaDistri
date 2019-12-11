/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jaant
 */
@Entity
@Table(name = "ADM_AULA")
public class AdmAula implements Serializable{
    @Id
    @Column(name = "COD_AULA", nullable = false)
    private String codigo;
    
    @Column(name = "CODIGO_ALTERNO", nullable = false, length = 4)
    private String codigoAlterno;
    
    @Column(name = "PISO", nullable = false)
    private Integer piso;
    
    @Column(name = "TIPO", nullable = false, length = 3)
    private String tipo;
    
    @Column(name = "CAPACIDAD", nullable = false)
    private Integer capacidad;
    
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmEdificio codigoAdmSede;
    
    @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO")
    @ManyToOne
    private AdmEdificio codigoAdmEdificio;
    
    @OneToMany(mappedBy = "codAula", fetch = FetchType.LAZY)
    private List<AdmAsignatParalHorario> admAsignatParalHorario;
    
    
    
}
