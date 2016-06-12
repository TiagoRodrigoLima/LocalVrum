/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.test;

import br.edu.ifpe.recife.locavrum.dao.CarroDaoJDBC;
import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.List;

/**
 *
 * @author tiago
 */
public class TestaListarCarrosJDBC {
    public static void main(String[] args) {
        
        // Cria um objeto do dao
        CarroDaoJDBC dao = new CarroDaoJDBC();
        
        List<Carro> carros = dao.listar();
        
        for (Carro carro : carros) {
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Quilometragem: " + carro.getQuilometragem());
            System.out.println("Preço Aluguel: " + carro.getPrecoAluguel());
            System.out.println("Alugado(?): " + carro.isAlugado());
            System.out.println("");
//            System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        }
    }
}
