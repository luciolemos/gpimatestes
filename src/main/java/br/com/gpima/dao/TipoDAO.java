package br.com.gpima.dao;

import br.com.gpima.domain.Tipo;
import br.com.gpima.util.GenericDAO;

public class TipoDAO extends GenericDAO<Tipo> {

    @Override
    public Class<Tipo> getClassType() {
        return Tipo.class;
    }

}
