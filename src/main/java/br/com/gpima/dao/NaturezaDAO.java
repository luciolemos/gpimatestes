package br.com.gpima.dao;

import br.com.gpima.domain.Natureza;
import br.com.gpima.util.GenericDAO;

public class NaturezaDAO extends GenericDAO<Natureza> {

    @Override
    public Class<Natureza> getClassType() {
        return Natureza.class;
    }

}
