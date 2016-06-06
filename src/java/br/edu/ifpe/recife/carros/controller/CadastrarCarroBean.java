/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.carros.controller;

import br.edu.ifpe.recife.carros.model.Carro;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Eduardo
 */
@ManagedBean
@RequestScoped
public class CadastrarCarroBean extends BasicBean{

    private Carro novo;
    private int anoAtual;
    
    public CadastrarCarroBean() {
        Date dataAtual = new Date();
        
        novo = new Carro();
        anoAtual = dataAtual.getYear();
        
    }

    public String adicionarCarro(){
        
        //método para adicionar um carro;
        
        //Redirecionamento
        return "/view/index.xhtml";
    }
    
    public Carro getNovo() {
        return novo;
    }

    public void setNovo(Carro novo) {
        this.novo = novo;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    
}
