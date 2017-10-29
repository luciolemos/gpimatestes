package br.com.gpima.dao;

import br.com.gpima.domain.Militar;
import br.com.gpima.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;



public class MilitarDAO extends GenericDAO<Militar> {

    @Override
    public Class<Militar> getClassType() {
        return Militar.class;
    }
    
    public List<Militar> buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Militar c WHERE c.cpf like :cpfMilitar";
        TypedQuery<Militar> consulta = getEm().createQuery(jpql, Militar.class).setMaxResults(3);
        consulta.setParameter("cpfMilitar", "%" + cpf + "%");
        return consulta.getResultList();
    }
    
}
