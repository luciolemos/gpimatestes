package br.com.gpima.bean;

import br.com.gpima.dao.SubunidadeDAO;
import br.com.gpima.domain.Subunidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "subunidadeBean")
public class SubunidadeBean {

    private Subunidade subunidade = new Subunidade();

    public void salvar() {
        SubunidadeDAO dao = new SubunidadeDAO();
        if (this.subunidade.getId() == 0) {
            dao.insert(this.subunidade);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.subunidade);
        }
        this.subunidade = new Subunidade();
        
    }
    
    
    public void editar(Subunidade subunidade) {
        this.subunidade = subunidade;
    }
    
        
    public void remover(Subunidade subunidade) {
        SubunidadeDAO dao = new SubunidadeDAO();
        dao.delete(subunidade);
    }
    
    public List<Subunidade> getSubunidades() {
        SubunidadeDAO dao = new SubunidadeDAO();
        return dao.selectAll();
    }
    
    public Subunidade getSubunidade() {
        return subunidade;
    }

    public void setSubunidade(Subunidade subunidade) {
        this.subunidade = subunidade;
    }
    
    
}