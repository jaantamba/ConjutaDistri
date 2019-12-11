/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.dao;

import ec.espe.edu.distribuidas.conjunta.model.AdmAula;

/**
 *
 * @author jaant
 */
public class AdmAulaDAO extends AbstractDAO<AdmAula>{
    
    public AdmAulaDAO() {
        super(AdmAula.class);
    }
    
    public AdmAula findByCodeAula(String codigoAula) {
        return this.finder(
                "SELECT a FROM ADM_AULA a WHERE a.codigoAula = ?1",
                new Object[]{
                    codigoAula
                }
        ).get(0);
    }
    
}
