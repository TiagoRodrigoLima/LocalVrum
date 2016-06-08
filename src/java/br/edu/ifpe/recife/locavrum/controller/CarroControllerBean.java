/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.controller;

import br.edu.ifpe.recife.locavrum.model.Carro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Eduardo
 */
@ManagedBean
@SessionScoped
public class CarroControllerBean extends BasicBean {

    private List<Carro> carros = new ArrayList<Carro>();
    private List<Carro>  carrosSelecionados = new ArrayList<Carro>();
    private Carro carro;

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
        
        carro = new Carro();
        
    }

    public void cadastrarCarro() {

        System.out.println("br.edu.ifpe.recife.locavrum.controller.CarroControllerBean.cadastrarCarro()");
        
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(CarroControllerBean.class.getName()).log(Level.SEVERE, null, ex);
        }
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
