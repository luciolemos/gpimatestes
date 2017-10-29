package br.com.gpima.dao;

import br.com.gpima.domain.Subunidade;
import br.com.gpima.util.GenericDAO;

public class SubunidadeDAO extends GenericDAO<Subunidade> {

    @Override
    public Class<Subunidade> getClassType() {
        return Subunidade.class;
    }

}
