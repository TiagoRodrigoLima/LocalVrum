/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * Classe pai para conter as informações/métodos padrões para todos os Beans
 * @author Eduardo
 */
@ManagedBean
@RequestScoped
public class BasicBean implements Serializable {

    /**
     * Creates a new instance of BasicBean
     */
    public BasicBean() {
    }
    
    public void cancelar(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/LocaVrum/view/index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(BasicBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
