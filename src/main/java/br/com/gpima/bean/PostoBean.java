package br.com.gpima.bean;

import br.com.gpima.dao.PostoDAO;
import br.com.gpima.domain.Posto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "postoBean")
public class PostoBean {

    private Posto posto = new Posto();

    public void salvar() {
        PostoDAO dao = new PostoDAO();
        if (this.posto.getId() == 0) {
            dao.insert(this.posto);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.posto);
        }
        this.posto = new Posto();
        
    }
    
    
    public void editar(Posto posto) {
        this.posto = posto;
    }
    
        
    public void remover(Posto posto) {
        PostoDAO dao = new PostoDAO();
        dao.delete(posto);
    }
    
    public List<Posto> getPostos() {
        PostoDAO dao = new PostoDAO();
        return dao.selectAll();
    }
    
    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }
    
    
}