/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author lucio
 */
@Entity
@Table(name = "tbl_imovel")
public class Imovel implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;      
    private String endereco;   
    private String descricao;    
    private float preco;       
    private String sequencialsemut;    
    private String inscricaoimovel;    
    private String matriculacaern;   
    private String inscricaocaern;    
    private String contratocosern; 
    private String cnpjcontribuinte;       
    private String nocadimovel;
    
    
    @ManyToOne //classe interna to classe externa
    private Categoria categoria;
    @ManyToOne //classe interna to classe externa
    private Natureza natureza;    
    @ManyToOne //classe interna to classe externa
    private Tipo tipo;
    public Imovel() {
    }

    public Imovel(int id, String endereco, String descricao, float preco, String sequencialsemut, String inscricaoimovel, String matriculacaern, String inscricaocaern, String contratocosern, String cnpjcontribuinte, String nocadimovel, Categoria categoria, Natureza natureza, Tipo tipo) {
        this.id = id;
        this.endereco = endereco;
        this.descricao = descricao;
        this.preco = preco;
        this.sequencialsemut = sequencialsemut;
        this.inscricaoimovel = inscricaoimovel;
        this.matriculacaern = matriculacaern;
        this.inscricaocaern = inscricaocaern;
        this.contratocosern = contratocosern;
        this.cnpjcontribuinte = cnpjcontribuinte;
        this.nocadimovel = nocadimovel;
        this.categoria = categoria;
        this.natureza = natureza;
        this.tipo = tipo;
    }

    public Imovel(String endereco, String descricao, float preco, String sequencialsemut, String inscricaoimovel, String matriculacaern, String inscricaocaern, String contratocosern, String cnpjcontribuinte, String nocadimovel, Categoria categoria, Natureza natureza, Tipo tipo) {
        this.endereco = endereco;
        this.descricao = descricao;
        this.preco = preco;
        this.sequencialsemut = sequencialsemut;
        this.inscricaoimovel = inscricaoimovel;
        this.matriculacaern = matriculacaern;
        this.inscricaocaern = inscricaocaern;
        this.contratocosern = contratocosern;
        this.cnpjcontribuinte = cnpjcontribuinte;
        this.nocadimovel = nocadimovel;
        this.categoria = categoria;
        this.natureza = natureza;
        this.tipo = tipo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getSequencialsemut() {
        return sequencialsemut;
    }

    public void setSequencialsemut(String sequencialsemut) {
        this.sequencialsemut = sequencialsemut;
    }

    public String getInscricaoimovel() {
        return inscricaoimovel;
    }

    public void setInscricaoimovel(String inscricaoimovel) {
        this.inscricaoimovel = inscricaoimovel;
    }

    public String getMatriculacaern() {
        return matriculacaern;
    }

    public void setMatriculacaern(String matriculacaern) {
        this.matriculacaern = matriculacaern;
    }

    public String getInscricaocaern() {
        return inscricaocaern;
    }

    public void setInscricaocaern(String inscricaocaern) {
        this.inscricaocaern = inscricaocaern;
    }

    public String getContratocosern() {
        return contratocosern;
    }

    public void setContratocosern(String contratocosern) {
        this.contratocosern = contratocosern;
    }

    public String getCnpjcontribuinte() {
        return cnpjcontribuinte;
    }

    public void setCnpjcontribuinte(String cnpjcontribuinte) {
        this.cnpjcontribuinte = cnpjcontribuinte;
    }

    public String getNocadimovel() {
        return nocadimovel;
    }

    public void setNocadimovel(String nocadimovel) {
        this.nocadimovel = nocadimovel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Natureza getNatureza() {
        return natureza;
    }

    public void setNatureza(Natureza natureza) {
        this.natureza = natureza;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Imovel other = (Imovel) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imovel{" + "id=" + id + ", endereco=" + endereco + ", descricao=" + descricao + ", preco=" + preco + ", sequencialsemut=" + sequencialsemut + ", inscricaoimovel=" + inscricaoimovel + ", matriculacaern=" + matriculacaern + ", inscricaocaern=" + inscricaocaern + ", contratocosern=" + contratocosern + ", cnpjcontribuinte=" + cnpjcontribuinte + ", nocadimovel=" + nocadimovel + ", categoria=" + categoria + ", natureza=" + natureza + ", tipo=" + tipo + '}';
    }

   
}
