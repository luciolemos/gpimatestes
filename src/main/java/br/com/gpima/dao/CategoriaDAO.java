package br.com.gpima.dao;

import br.com.gpima.domain.Categoria;
import br.com.gpima.util.GenericDAO;

public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }

}
