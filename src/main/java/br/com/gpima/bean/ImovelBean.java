package br.com.gpima.bean;

import br.com.gpima.dao.CategoriaDAO;
import br.com.gpima.dao.NaturezaDAO;
import br.com.gpima.dao.ImovelDAO;
import br.com.gpima.dao.TipoDAO;
import br.com.gpima.domain.Categoria;
import br.com.gpima.domain.Natureza;
import br.com.gpima.domain.Imovel;
import br.com.gpima.domain.Tipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "imovelBean")
public class ImovelBean {
    
    private Imovel imovel = new Imovel();
    
    public void salvar() {
        ImovelDAO dao = new ImovelDAO();
        if (this.imovel.getId() == 0) {
            dao.insert(this.imovel);
        } else {
            dao.update(this.imovel);
        }
        this.imovel = new Imovel();
    }
    
    public void editar(Imovel imovel) {
        this.imovel = imovel;
    }
    
    public void excluir(Imovel imovel) {
        ImovelDAO dao = new ImovelDAO();
        dao.delete(imovel);
    }

    public List<Categoria> getCategorias() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
     public List<Natureza> getNaturezas() {
        NaturezaDAO dao = new NaturezaDAO();
        return dao.selectAll();
    }
     
     public List<Tipo> getTipos() {
        TipoDAO dao = new TipoDAO();
        return dao.selectAll();
    }
    
    public List<Imovel> getImoveis() {
        ImovelDAO dao = new ImovelDAO();
        return dao.selectAll();
    }
    
    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
}