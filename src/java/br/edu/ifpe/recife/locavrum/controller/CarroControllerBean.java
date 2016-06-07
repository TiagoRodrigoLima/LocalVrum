/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.controller;

import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Eduardo
 */
@ManagedBean
@RequestScoped
public class CarroControllerBean extends BasicBean {

    private List<Carro> carros;
    private Carro carro;
//    private int anoAtual;

    public CarroControllerBean() {
        Date dataAtual = new Date();
        carro = new Carro();
//        anoAtual = dataAtual.getYear();

    }

    public void cadastrarCarro(Carro carro) {

        //Redirecionamento
//        return "/view/index.xhtml";
    }

    public void alterarCarro(Carro carro) {
//        return "";
    }

    public void removerCarro(Carro carro) {
//        return "";
    }

    public List<Carro> listarCarros() {
        return carros;
    }

    public void emprestarCarro(Carro carro) {

    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

//    public int getAnoAtual() {
//        return anoAtual;
//    }
//
//    public void setAnoAtual(int anoAtual) {
//        this.anoAtual = anoAtual;
//    }
}
