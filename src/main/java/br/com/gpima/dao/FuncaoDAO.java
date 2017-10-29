package br.com.gpima.dao;

import br.com.gpima.domain.Funcao;
import br.com.gpima.util.GenericDAO;

public class FuncaoDAO extends GenericDAO<Funcao> {

    @Override
    public Class<Funcao> getClassType() {
        return Funcao.class;
    }

}
