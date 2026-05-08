/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u07740243132
 */
public class AgrVendasProduto {
    private int agrIdVendasProdutos;
    private Date agrDataVendasProduto;
    private Double agrValorTotal;
    private String agrFormaPagamento;
    private int agrFkVenda;
    private int agrFkProduto;

    public int getAgrIdVendasProdutos() {
        return agrIdVendasProdutos;
    }

    public void setAgrIdVendasProdutos(int agrIdVendasProdutos) {
        this.agrIdVendasProdutos = agrIdVendasProdutos;
    }

    public Date getAgrDataVendasProduto() {
        return agrDataVendasProduto;
    }

    public void setAgrDataVendasProduto(Date agrDataVendasProduto) {
        this.agrDataVendasProduto = agrDataVendasProduto;
    }
    
    public Double getAgrValorTotal() {
        return agrValorTotal;
    }

    public void setAgrValorTotal(Double agrValorTotal) {
        this.agrValorTotal = agrValorTotal;
    }

    public String getAgrFormaPagamento() {
        return agrFormaPagamento;
    }

    public void setAgrFormaPagamento(String agrFormaPagamento) {
        this.agrFormaPagamento = agrFormaPagamento;
    }

    public int getAgrFkVenda() {
        return agrFkVenda;
    }

    public void setAgrFkVenda(int agrFkVenda) {
        this.agrFkVenda = agrFkVenda;
    }

    public int getAgrFkProduto() {
        return agrFkProduto;
    }

    public void setAgrFkProduto(int agrFkProduto) {
        this.agrFkProduto = agrFkProduto;
    }
}
