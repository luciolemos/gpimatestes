package br.com.gpima.dao;

import br.com.gpima.domain.Sexo;
import br.com.gpima.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}
