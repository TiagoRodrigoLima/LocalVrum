/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.test;

import br.edu.ifpe.recife.locavrum.dao.CarroDaoJDBC;
import br.edu.ifpe.recife.locavrum.model.Carro;
import java.sql.SQLException;

/**
 *
 * @author tiago
 */
public class TestaAlterarCarroJDBC {
        public static void main(String[] args) throws SQLException {
        // Cria o bojeto carro para gravar
        Carro carro = new Carro();
        carro.setMarca("Volkswagen");
        carro.setModelo("CrossFox");
        carro.setAno(2016);
        carro.setPrecoAluguel(249.99);
        carro.setQuilometragem(0);
        carro.setAlugado(false);
        carro.setId((long)1);
//        carro.setAnoFabricacao(Calendar.getInstance().getTimeInMillis());
        
        
        // Gravar nessa conexão
        CarroDaoJDBC dao = new CarroDaoJDBC();
        
        // Cadastra o carro
        dao.alterar(carro);
        
        System.out.println("Carro alterado com sucesso!");
    }
}
