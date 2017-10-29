package br.com.gpima.bean;

import br.com.gpima.dao.CategoriaDAO;
import br.com.gpima.domain.Categoria;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "categoriaBean")
public class CategoriaBean {

    private Categoria categoria = new Categoria();

    public void salvar() {
        CategoriaDAO dao = new CategoriaDAO();
        if (this.categoria.getId() == 0) {
            dao.insert(this.categoria);
//            FacesMessage msg = new FacesMessage("Registro salvo com sucesso!", "This book has already been added");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
          
        } else {
            dao.update(this.categoria);
        }
        this.categoria = new Categoria();
        
    }
    
    
    public void editar(Categoria categoria) {
        this.categoria = categoria;
    }
    
        
    public void remover(Categoria categoria) {
        CategoriaDAO dao = new CategoriaDAO();
        dao.delete(categoria);
    }
    
    public List<Categoria> getCategorias() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}