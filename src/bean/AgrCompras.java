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
public class AgrCompras {
    private int agrIdVenda;
    private int agrFkFornecedor;
    private Double agrValorTotal;
    private String agrFormaPagamento;
    private Date agrDataPagamento;
    private int agrFkUsuario;

    public int getAgrIdVenda() {
        return agrIdVenda;
    }

    public void setAgrIdVenda(int agrIdVenda) {
        this.agrIdVenda = agrIdVenda;
    }

    public int getAgrFkFornecedor() {
        return agrFkFornecedor;
    }

    public void setAgrFkFornecedor(int agrFkFornecedor) {
        this.agrFkFornecedor = agrFkFornecedor;
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

    public Date getAgrDataPagamento() {
        return agrDataPagamento;
    }

    public void setAgrDataPagamento(Date agrDataPagamento) {
        this.agrDataPagamento = agrDataPagamento;
    }

    public int getAgrFkUsuario() {
        return agrFkUsuario;
    }

    public void setAgrFkUsuario(int agrFkUsuario) {
        this.agrFkUsuario = agrFkUsuario;
    }
}
