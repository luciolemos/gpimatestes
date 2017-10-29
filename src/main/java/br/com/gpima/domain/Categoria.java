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
@Table(name = "tbl_categoria")
public class Categoria implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;    
    private String categoriapnr;    
    private String descricaocategoria;
    public Categoria() {
    }

    public Categoria(int id, String categoriapnr, String descricaocategoria) {
        this.id = id;
        this.categoriapnr = categoriapnr;
        this.descricaocategoria = descricaocategoria;
    }

    public Categoria(String categoriapnr) {
        this.categoriapnr = categoriapnr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoriapnr() {
        return categoriapnr;
    }

    public void setCategoriapnr(String categoriapnr) {
        this.categoriapnr = categoriapnr;
    }

    public String getDescricaocategoria() {
        return descricaocategoria;
    }

    public void setDescricaocategoria(String descricaocategoria) {
        this.descricaocategoria = descricaocategoria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
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
        final Categoria other = (Categoria) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", categoriapnr=" + categoriapnr + ", descricaocategoria=" + descricaocategoria + '}';
    }
    
    

   
}