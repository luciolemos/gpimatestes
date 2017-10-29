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
@Table(name = "tbl_posto")
public class Posto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;      
    private String postograd;    
    private String descricaoposto;
    public Posto() {
    }

    public Posto(int id, String postograd, String descricaoposto) {
        this.id = id;
        this.postograd = postograd;
        this.descricaoposto = descricaoposto;
    }

    public Posto(String postograd, String descricaoposto) {
        this.postograd = postograd;
        this.descricaoposto = descricaoposto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostograd() {
        return postograd;
    }

    public void setPostograd(String postograd) {
        this.postograd = postograd;
    }

    public String getDescricaoposto() {
        return descricaoposto;
    }

    public void setDescricaoposto(String descricaoposto) {
        this.descricaoposto = descricaoposto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id;
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
        final Posto other = (Posto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Posto{" + "id=" + id + ", postograd=" + postograd + ", descricaoposto=" + descricaoposto + '}';
    }
    
}