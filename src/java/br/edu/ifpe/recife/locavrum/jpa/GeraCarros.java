/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tiago
 */
public class GeraCarros {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("Carros");
        factory.close();
    }
}
