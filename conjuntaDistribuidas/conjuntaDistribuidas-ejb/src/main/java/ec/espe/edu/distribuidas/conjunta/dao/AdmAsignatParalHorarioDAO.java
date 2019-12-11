/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.conjunta.dao;

import ec.espe.edu.distribuidas.conjunta.model.AdmAsignatParalHorario;

/**
 *
 * @author jaant
 */
public class AdmAsignatParalHorarioDAO extends AbstractDAO<AdmAsignatParalHorario> {

    public AdmAsignatParalHorarioDAO() {
        super(AdmAsignatParalHorario.class);
    }

    public AdmAsignatParalHorario findByCodeAsignatura(Integer codigoAsignatura) {
        return this.finder(
                "SELECT a FROM ADM_ASIGNAT_PARAL_HORARIO a WHERE a.codigoAsignatura = ?1",
                new Object[]{
                    codigoAsignatura
                }
        ).get(0);
    }

    public AdmAsignatParalHorario findByParalelo(String paralelo) {
        return this.finder(
                "SELECT a FROM ADM_ASIGNAT_PARAL_HORARIO a WHERE a.paralelo = ?1",
                new Object[]{
                    paralelo
                }
        ).get(0);
    }

    public AdmAsignatParalHorario findByCodeAula(Integer codigoAula) {
        return this.finder(
                "SELECT a FROM ADM_ASIGNAT_PARAL_HORARIO a WHERE a.codigoAula = ?1",
                new Object[]{
                    codigoAula
                }
        ).get(0);
    }

    public AdmAsignatParalHorario findByDia(String dia) {
        return this.finder(
                "SELECT a FROM ADM_ASIGNAT_PARAL_HORARIO a WHERE a.dia = ?1",
                new Object[]{
                    dia
                }
        ).get(0);
    }

}
