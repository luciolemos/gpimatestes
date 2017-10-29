package br.com.gpima.bean;

import br.com.gpima.dao.NaturezaDAO;
import br.com.gpima.domain.Natureza;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "naturezaBean")
public class NaturezaBean {

    private Natureza natureza = new Natureza();

    public void salvar() {
        NaturezaDAO dao = new NaturezaDAO();
        if (this.natureza.getId() == 0) {
            dao.insert(this.natureza);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.natureza);
        }
        this.natureza = new Natureza();
        
    }
    
    
    public void editar(Natureza natureza) {
        this.natureza = natureza;
    }
    
        
    public void remover(Natureza natureza) {
        NaturezaDAO dao = new NaturezaDAO();
        dao.delete(natureza);
    }
    
    public List<Natureza> getNaturezas() {
        NaturezaDAO dao = new NaturezaDAO();
        return dao.selectAll();
    }
    
    public Natureza getNatureza() {
        return natureza;
    }

    public void setNatureza(Natureza natureza) {
        this.natureza = natureza;
    }
    
    
}