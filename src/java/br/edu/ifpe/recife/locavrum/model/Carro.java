/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.model;

import br.edu.ifpe.recife.locavrum.padroes.memento.CarroCareTaker;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Carros")
public class Carro implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private long quilometragem;
    private double precoAluguel;
    private boolean alugado;
    @Temporal(TemporalType.DATE)
    private Date anoFabricacao;
    private CarroCareTaker historico;
    
    public Carro() {
        historico = new CarroCareTaker();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public CarroCareTaker getHistorico() {
        return historico;
    }

    public boolean isAlugado() {
        return alugado;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
}
