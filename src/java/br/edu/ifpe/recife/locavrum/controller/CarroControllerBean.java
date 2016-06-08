/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.controller;

import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Eduardo
 */
@ManagedBean
@ViewScoped
public class CarroControllerBean extends BasicBean {

    private List<Carro> carros = new ArrayList<Carro>();
    private List<Carro>  carrosSelecionados = new ArrayList<Carro>();
    private Carro carro;
    private int anoAtual;

    public CarroControllerBean() {
        
        for(int i = 0; i < 5; i++){
            Carro c = new Carro();
            c.setId(new Long(i));
            c.setModelo("Teste" + i);
            c.setMarca("Marca" + i);
            c.setQuilometragem(123444444+i);
            c.setAno(2000+i);
            c.setPrecoAluguel(200 + (i*5));
            carros.add(c);
            
        }
        
        Date dataAtual = new Date();
        carro = new Carro();
        anoAtual = dataAtual.getYear();
    }

    public void cadastrarCarro() {

        //Redirecionamento
//      return "/view/index.xhtml";
    }

    public void alterarCarro() {

    }

    public void removerCarro() {

    }

    public List<Carro> listarCarros() {
        return carros;
    }

    public void emprestarCarro() {

    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public List<Carro> getCarrosSelecionados() {
        return carrosSelecionados;
    }

    public void setCarrosSelecionados(List<Carro> carrosSelecionados) {
        this.carrosSelecionados = carrosSelecionados;
    }

}
