package br.com.gpima.bean;

import br.com.gpima.dao.MilitarDAO;
import br.com.gpima.dao.ImovelDAO;
import br.com.gpima.dao.DistribuicaoDAO;
import br.com.gpima.domain.Militar;
import br.com.gpima.domain.Imovel;
import br.com.gpima.domain.Distribuicao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "distribuicaoBean")
public class DistribuicaoBean {

    private Distribuicao distribuicao = new Distribuicao();
    private Militar militar = new Militar();
    private Imovel imovel = new Imovel();
    
    public void salvar() {
        DistribuicaoDAO dao = new DistribuicaoDAO();
        distribuicao.setMilitar(militar);
        System.out.println(distribuicao);
        dao.insert(distribuicao);
        limparForm();
    }
    
    private void limparForm() {
        distribuicao = new Distribuicao();
        imovel = new Imovel();
        militar = new Militar();
    }
    
    public void adicionarImovel() {
        this.distribuicao.adicionarImovel(this.imovel);
        System.out.println(this.imovel);
        this.imovel = new Imovel();
    }
    
    public List<Imovel> getImoveisPorNome(String nome) {
        ImovelDAO dao = new ImovelDAO();
        return dao.buscarPorNome(nome);
    }

    public List<Militar> getMilitaresPorCpf(String cpf) {
        MilitarDAO dao = new MilitarDAO();
        return dao.buscarPorCpf(cpf);
    }
    
    public Militar getMilitar() {
        return militar;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel produto) {
        this.imovel = produto;
    }
    
    public Distribuicao getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Distribuicao distribuicao) {
        this.distribuicao = distribuicao;
    }
    
}