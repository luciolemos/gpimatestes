package br.com.gpima.dao;

import br.com.gpima.domain.Posto;
import br.com.gpima.util.GenericDAO;

public class PostoDAO extends GenericDAO<Posto> {

    @Override
    public Class<Posto> getClassType() {
        return Posto.class;
    }

}
