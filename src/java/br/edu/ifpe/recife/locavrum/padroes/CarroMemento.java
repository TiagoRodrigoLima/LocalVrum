/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.padroes;

import br.edu.ifpe.recife.locavrum.model.Carro;

/**
 *
 * @author Eduardo
 */
public class CarroMemento {
    protected Carro estadoCarro;

    public CarroMemento(Carro estadoCarro) {
        this.estadoCarro = estadoCarro;
    }

    public Carro getEstadoCarro() {
        return estadoCarro;
    }
    
}
