package br.com.gpima.bean;

import br.com.gpima.dao.FuncaoDAO;
import br.com.gpima.domain.Funcao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "funcaoBean")
public class FuncaoBean {

    private Funcao funcao = new Funcao();

    public void salvar() {
        FuncaoDAO dao = new FuncaoDAO();
        if (this.funcao.getId() == 0) {
            dao.insert(this.funcao);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.funcao);
        }
        this.funcao = new Funcao();
        
    }
    
    
    public void editar(Funcao funcao) {
        this.funcao = funcao;
    }
    
        
    public void remover(Funcao funcao) {
        FuncaoDAO dao = new FuncaoDAO();
        dao.delete(funcao);
    }
    
    public List<Funcao> getFuncoes() {
        FuncaoDAO dao = new FuncaoDAO();
        return dao.selectAll();
    }
    
    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
    
}