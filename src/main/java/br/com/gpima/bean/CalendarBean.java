/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lucio
 */
@ViewScoped
@ManagedBean(name = "calendarBean")
public class CalendarBean {
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Temporal(TemporalType.DATE)
    private Date datapraca;   
  
}
