/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.dao;

import br.edu.ifpe.recife.locavrum.jdbc.ConnectionFactory;
import br.edu.ifpe.recife.locavrum.model.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tiago
 */
public class CarroDaoJDBC {
    // A conexão com o banco de dados
    private Connection connection;
    
    public CarroDaoJDBC() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void cadastrar(Carro carro) throws SQLException {
        
        String sql = "INSERT INTO Carros " +
                "(marca, modelo, ano, quilometragem, precoAluguel, alugado)" + 
                "VALUES (?,?,?,?,?,?)";
        
        try {
            // Prepared Statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // Seta os valores
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setInt(3, carro.getAno());
            stmt.setLong(4, carro.getQuilometragem());
            stmt.setDouble(5, carro.getPrecoAluguel());
            stmt.setBoolean(6, carro.isAlugado());
//            stmt.setDate(4, new Date(carro.getAnoFabricacao().getTime()));
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public List<Carro> listar() {
        try {
            List<Carro> carros = new ArrayList<>();
            try (PreparedStatement stmt = this.connection.
                    prepareStatement("SELECT * FROM Carros")) {
                ResultSet rs = stmt.executeQuery();
                
                
                while(rs.next()) {
                    // Criando o objeto carro
                    Carro carro = new Carro();
                    carro.setMarca(rs.getString("marca"));
                    carro.setModelo(rs.getString("modelo"));
                    carro.setPrecoAluguel(rs.getDouble("precoAluguel"));
                    carro.setQuilometragem(rs.getLong("quilometragem"));
                    carro.setAno(rs.getInt("ano"));
//                carro.setAnoFabricacao(rs.getDate("anoFabricacao"));
                    
                    // Montando a data através do Calendar
//                Calendar ano = Calendar.getInstance();
//                ano.setTime(rs.getDate("anoFabricacao"));
//                carro.setAnoFabricacao(ano);
                    carros.add(carro);
                }
                
                rs.close();
            }
            return carros;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterar(Carro carro) {
        String sql = "UPDATE Carros SET marca=?, modelo=?, ano=?, " + 
                "quilometragem=?, precoAluguel=?, alugado=? WHERE id=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setInt(3, carro.getAno());
            stmt.setLong(4, carro.getQuilometragem());
            stmt.setDouble(5, carro.getPrecoAluguel());
            stmt.setBoolean(6, carro.isAlugado());
            stmt.setLong(7, carro.getId());
//            stmt.setDate(6, (java.sql.Date) new Date(carro.getAnoFabricacao().getTime()));
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remover(Carro carro) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                        "DELETE FROM Carros WHERE id = ?");
            stmt.setLong(1, carro.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
