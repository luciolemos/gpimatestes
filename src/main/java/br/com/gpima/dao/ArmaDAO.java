package br.com.gpima.dao;

import br.com.gpima.domain.Arma;
import br.com.gpima.util.GenericDAO;

public class ArmaDAO extends GenericDAO<Arma> {

    @Override
    public Class<Arma> getClassType() {
        return Arma.class;
    }

}
