package br.com.gpima.dao;

import br.com.gpima.domain.Imovel;
import br.com.gpima.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;



public class ImovelDAO extends GenericDAO<Imovel> {

    @Override
    public Class<Imovel> getClassType() {
        return Imovel.class;
    }

    public List<Imovel> buscarPorNome(String nome) {
        String jpql = "select p from Imovel p where p.nome like :nome";
        TypedQuery<Imovel> query = getEm().createQuery(jpql, Imovel.class).setMaxResults(15);
        query.setParameter("nome", "%"+ nome + "%");
        return query.getResultList();
    }

}
