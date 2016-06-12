/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.dao;

import br.edu.ifpe.recife.locavrum.jpa.JPAUtil;
import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author tiago
 */
public class CarroDaoJPA {
    Carro carro = new Carro();
    List<Carro> carros = new ArrayList<>();
    
    public void salvar() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        
        em.persist(carro);
        
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Carro> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        Query q = em.createQuery("SELECT a FROM Carros a",
                Carro.class);
        
        this.carros = q.getResultList();
        em.close();
        return carros;
    }
}
