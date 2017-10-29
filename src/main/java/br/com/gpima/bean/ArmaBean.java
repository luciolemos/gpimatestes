package br.com.gpima.bean;

import br.com.gpima.dao.ArmaDAO;
import br.com.gpima.domain.Arma;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "armaBean")
public class ArmaBean {

    private Arma arma = new Arma();

    public void salvar() {
        ArmaDAO dao = new ArmaDAO();
        if (this.arma.getId() == 0) {
            dao.insert(this.arma);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.arma);
        }
        this.arma = new Arma();
        
    }
    
    
    public void editar(Arma arma) {
        this.arma = arma;
    }
    
        
    public void remover(Arma arma) {
        ArmaDAO dao = new ArmaDAO();
        dao.delete(arma);
    }
    
    public List<Arma> getArmas() {
        ArmaDAO dao = new ArmaDAO();
        return dao.selectAll();
    }
    
    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    
}