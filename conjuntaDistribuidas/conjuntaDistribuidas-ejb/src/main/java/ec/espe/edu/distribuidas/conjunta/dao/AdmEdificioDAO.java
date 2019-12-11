/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.dao;

import ec.espe.edu.distribuidas.conjunta.model.AdmEdificio;

/**
 *
 * @author jaant
 */
public class AdmEdificioDAO extends AbstractDAO<AdmEdificio>{
    
    public AdmEdificioDAO() {
        super(AdmEdificio.class);
    }
    
    public AdmEdificio findByCodeSede(String codigoSede) {
        return this.finder(
                "SELECT a FROM ADM_EDIFICIO a WHERE a.codigoSede = ?1",
                new Object[]{
                    codigoSede
                }
        ).get(0);
    }
    
    public AdmEdificio findByCodeEdificio(String codigoEdificio) {
        return this.finder(
                "SELECT a FROM ADM_EDIFICIO a WHERE a.codigoEdificio = ?1",
                new Object[]{
                    codigoEdificio
                }
        ).get(0);
    }
}
