package br.com.gpima.bean;

import br.com.gpima.dao.ArmaDAO;
import br.com.gpima.dao.FuncaoDAO;
import br.com.gpima.dao.MilitarDAO;
import br.com.gpima.dao.PostoDAO;
import br.com.gpima.dao.SexoDAO;
import br.com.gpima.dao.SubunidadeDAO;
import br.com.gpima.domain.Arma;
import br.com.gpima.domain.Funcao;
import br.com.gpima.domain.Militar;
import br.com.gpima.domain.Posto;
import br.com.gpima.domain.Sexo;
import br.com.gpima.domain.Subunidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "militarBean")
public class MilitarBean {
    
    private Militar militar = new Militar();    
    public void salvar() {
        MilitarDAO dao = new MilitarDAO();
        if (this.militar.getId() == 0) {
            dao.insert(this.militar);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
            dao.update(this.militar);
        }
        this.militar = new Militar();
    }
    
    public void editar(Militar militar) {
        this.militar = militar;
    }
    
    public void excluir(Militar militar) {
        MilitarDAO dao = new MilitarDAO();
        dao.delete(militar);
    }

      
    public List<Militar> getMilitares() {
        MilitarDAO dao = new MilitarDAO();
        return dao.selectAll();
    }
    
     
    public List<Sexo> getSexos() {
        SexoDAO dao = new SexoDAO();
        return dao.selectAll();
    }
    
    public List<Posto> getPostos() {
        PostoDAO dao = new PostoDAO();
        return dao.selectAll();
    }
     
    public List<Arma> getArmas() {
        ArmaDAO dao = new ArmaDAO();
        return dao.selectAll();
    }
    
    public List<Subunidade> getSubunidades() {
        SubunidadeDAO dao = new SubunidadeDAO();
        return dao.selectAll();
    }
    
    public List<Funcao> getFuncoes() {
        FuncaoDAO dao = new FuncaoDAO();
        return dao.selectAll();
    }
    
    public Militar getMilitar() {
        return militar;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }
    
    
    
}
    