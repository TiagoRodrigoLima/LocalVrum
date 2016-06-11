/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.padroes;

/**
 *
 * @author Eduardo
 */
public class RelatorioVendas{
    protected int totalAlugado = 0;
    protected double faturamento = 0;
    
    public static RelatorioVendas vendas;
    
    protected RelatorioVendas(){
    }
    
    public static RelatorioVendas getLog(){
        if(vendas == null){
            vendas =  new RelatorioVendas();
        }
        
        return vendas;
        
    }
    
    public int getTotalAlugado(){
        return totalAlugado;
    }
    
    public double getFaturamento(){
        return faturamento;
    }
    
    public void adcionarVenda(double preco){
        totalAlugado++;
        faturamento += preco;
    }
    
}
