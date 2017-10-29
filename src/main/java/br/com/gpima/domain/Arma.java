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
@Table(name = "tbl_arma")
public class Arma implements Serializable {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;       
    private String armaquadroservico;    
    private String descricaoarma;
    public Arma() {
    }

    public Arma(int id, String armaquadroservico, String descricaoarma) {
        this.id = id;
        this.armaquadroservico = armaquadroservico;
        this.descricaoarma = descricaoarma;
    }

    public Arma(String armaquadroservico, String descricaoarma) {
        this.armaquadroservico = armaquadroservico;
        this.descricaoarma = descricaoarma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArmaquadroservico() {
        return armaquadroservico;
    }

    public void setArmaquadroservico(String armaquadroservico) {
        this.armaquadroservico = armaquadroservico;
    }

    public String getDescricaoarma() {
        return descricaoarma;
    }

    public void setDescricaoarma(String descricaoarma) {
        this.descricaoarma = descricaoarma;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Arma other = (Arma) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Arma{" + "id=" + id + ", armaquadroservico=" + armaquadroservico + ", descricaoarma=" + descricaoarma + '}';
    }

   
}