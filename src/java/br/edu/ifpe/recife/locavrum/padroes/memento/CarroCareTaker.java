/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.padroes.memento;

import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class CarroCareTaker {
    
    protected ArrayList<CarroMemento> estados;

    public CarroCareTaker() {
        estados = new ArrayList<CarroMemento>();
    }
    
    public void adicionarMemento(CarroMemento estadoCarro){
        estados.add(estadoCarro);
    }
    
    public CarroMemento getUltimoEstado(){
        
        if(estados.size() <= 0){
            return null;
        }else{
            CarroMemento ultimoEstado = estados.get(estados.size() - 1);
            estados.remove(estados.get(estados.size() - 1));
            
            return ultimoEstado;
        }
        
    }
    
}
