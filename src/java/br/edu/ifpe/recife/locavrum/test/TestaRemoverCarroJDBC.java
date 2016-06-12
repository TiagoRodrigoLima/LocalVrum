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
public class TestaRemoverCarroJDBC {

    public static void main(String[] args) throws SQLException {
        // Cria o bojeto carro para gravar
        Carro carro = new Carro();
        carro.setId((long) 1);
//        carro.setAnoFabricacao(Calendar.getInstance().getTimeInMillis());

        // Gravar nessa conexão
        CarroDaoJDBC dao = new CarroDaoJDBC();

        // Cadastra o carro
        dao.remover(carro);

        System.out.println("Carro removido com sucesso!");
    }
}
