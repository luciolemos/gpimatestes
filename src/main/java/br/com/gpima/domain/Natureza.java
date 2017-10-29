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
@Table(name = "tbl_natureza")
public class Natureza implements Serializable {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String naturezapnr;      
    private String descricaoanatureza;
    public Natureza() {
    }

    public Natureza(int id, String naturezapnr, String descricaoanatureza) {
        this.id = id;
        this.naturezapnr = naturezapnr;
        this.descricaoanatureza = descricaoanatureza;
    }

    public Natureza(String naturezapnr, String descricaoanatureza) {
        this.naturezapnr = naturezapnr;
        this.descricaoanatureza = descricaoanatureza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaturezapnr() {
        return naturezapnr;
    }

    public void setNaturezapnr(String naturezapnr) {
        this.naturezapnr = naturezapnr;
    }

    public String getDescricaoanatureza() {
        return descricaoanatureza;
    }

    public void setDescricaoanatureza(String descricaoanatureza) {
        this.descricaoanatureza = descricaoanatureza;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
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
        final Natureza other = (Natureza) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Natureza{" + "id=" + id + ", naturezapnr=" + naturezapnr + ", descricaoanatureza=" + descricaoanatureza + '}';
    }
    
    


}