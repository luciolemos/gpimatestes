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
import javax.persistence.Table;

@Entity
@Table(name = "tbl_funcao")
public class Funcao implements Serializable {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String designacaofuncao;
    private String descricaofuncao;
   
    public Funcao() {
    }

    public Funcao(int id, String designacaofuncao, String descricaofuncao) {
        this.id = id;
        this.designacaofuncao = designacaofuncao;
        this.descricaofuncao = descricaofuncao;
    }

    public Funcao(String designacaofuncao, String descricaofuncao) {
        this.designacaofuncao = designacaofuncao;
        this.descricaofuncao = descricaofuncao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignacaofuncao() {
        return designacaofuncao;
    }

    public void setDesignacaofuncao(String designacaofuncao) {
        this.designacaofuncao = designacaofuncao;
    }

    public String getDescricaofuncao() {
        return descricaofuncao;
    }

    public void setDescricaofuncao(String descricaofuncao) {
        this.descricaofuncao = descricaofuncao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
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
        final Funcao other = (Funcao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcao{" + "id=" + id + ", designacaofuncao=" + designacaofuncao + ", descricaofuncao=" + descricaofuncao + '}';
    }

   
}