/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.dao;

import ec.espe.edu.distribuidas.conjunta.model.AdmSede;

/**
 *
 * @author jaant
 */
public class AdmSedeDAO extends AbstractDAO<AdmSede>{
    
    public AdmSedeDAO() {
        super(AdmSede.class);
    }
    public AdmSede findByCode(String codigoSede) {
        return this.finder(
                "SELECT a FROM ADM_SEDE a WHERE a.codigoSede = ?1",
                new Object[]{
                    codigoSede
                }
        ).get(0);
    }
    
}
