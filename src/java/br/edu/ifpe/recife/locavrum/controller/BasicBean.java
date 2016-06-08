/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
    
    public String cancelar(){
        return "index.xhtml";
    }
    
}
