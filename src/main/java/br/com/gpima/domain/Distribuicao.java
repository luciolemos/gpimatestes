/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_distribuicao")
public class Distribuicao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     
    @Temporal(TemporalType.DATE)    
    private Calendar dataocupacao = Calendar.getInstance();
    
    @ManyToOne
    private Militar militar;
    
    @ManyToMany
    private List<Imovel> imoveis = new ArrayList<Imovel>();     
    private float valor;

    public Distribuicao() {
    }

    public Distribuicao(int id, Militar militar, float valor) {
        this.id = id;
        this.militar = militar;
        this.valor = valor;
    }

    public Distribuicao(Militar militar, float valor) {
        this.militar = militar;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataocupacao() {
        return dataocupacao;
    }

    public void setDataocupacao(Calendar dataocupacao) {
        this.dataocupacao = dataocupacao;
    }

    public Militar getMilitar() {
        return militar;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Distribuicao other = (Distribuicao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Distribuicao{" + "id=" + id + ", dataocupacao=" + dataocupacao + ", militar=" + militar + ", imoveis=" + imoveis + ", valor=" + valor + '}';
    }

    public void adicionarImovel(Imovel imovel) {
        this.imoveis.add(imovel);
        this.valor += imovel.getPreco();
    }

    public void removerImovel(Imovel imovel) {
        this.imoveis.remove(imovel);
    }
    
}