package br.com.gpima.bean;

import br.com.gpima.dao.TipoDAO;
import br.com.gpima.domain.Tipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "tipoBean")
public class TipoBean {

    private Tipo tipo = new Tipo();

    public void salvar() {
        TipoDAO dao = new TipoDAO();
        if (this.tipo.getId() == 0) {
            dao.insert(this.tipo);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.tipo);
        }
        this.tipo = new Tipo();
        
    }
    
    
    public void editar(Tipo tipo) {
        this.tipo = tipo;
    }
    
        
    public void remover(Tipo tipo) {
        TipoDAO dao = new TipoDAO();
        dao.delete(tipo);
    }
    
    public List<Tipo> getTipos() {
        TipoDAO dao = new TipoDAO();
        return dao.selectAll();
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}