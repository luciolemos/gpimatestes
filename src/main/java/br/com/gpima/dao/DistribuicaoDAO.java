/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.dao;

import br.com.gpima.domain.Distribuicao;
import br.com.gpima.util.GenericDAO;

/**
 *
 * @author lucio
 */
public class DistribuicaoDAO extends GenericDAO<Distribuicao>{
     @Override
    public Class<Distribuicao> getClassType() {
        return Distribuicao.class;
    }
}
