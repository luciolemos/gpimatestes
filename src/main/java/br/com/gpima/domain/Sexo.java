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
@Table(name = "tbl_sexo")
public class Sexo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;   
    private String tiposexo;  
    private String descricaosexo;
    public Sexo() {
    }

    public Sexo(int id, String tiposexo, String descricaosexo) {
        this.id = id;
        this.tiposexo = tiposexo;
        this.descricaosexo = descricaosexo;
    }

    public Sexo(String tiposexo, String descricaosexo) {
        this.tiposexo = tiposexo;
        this.descricaosexo = descricaosexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiposexo() {
        return tiposexo;
    }

    public void setTiposexo(String tiposexo) {
        this.tiposexo = tiposexo;
    }

    public String getDescricaosexo() {
        return descricaosexo;
    }

    public void setDescricaosexo(String descricaosexo) {
        this.descricaosexo = descricaosexo;
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
        final Sexo other = (Sexo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sexo{" + "id=" + id + ", tiposexo=" + tiposexo + ", descricaosexo=" + descricaosexo + '}';
    }
    
    

}