/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.jpa;

import br.edu.ifpe.recife.locavrum.model.Carro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tiago
 */
public class GeraCarros {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("locavrum");
        EntityManager em = emf.createEntityManager();
 
        try {
            em.getTransaction().begin();
             
            Carro carro = new Carro();
            carro.setId(Long.MIN_VALUE);
            carro.setMarca("Volkswagen");
            carro.setModelo("CrossFox");
             
            em.persist(carro);
             
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
        }
        finally{
            emf.close();
        }
         
        System.out.println("Concluído!");
    }
}
