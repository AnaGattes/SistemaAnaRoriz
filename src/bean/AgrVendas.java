/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author u07740243132
 */
public class AgrVendas {
    private int agrIdVendasProduto;
    private Double agrValorUnitario;
    private String agrFormaPagamento;
    private int agrFkClientes;
    private int agrFkVendedor;

    public int getAgrIdVendasProduto() {
        return agrIdVendasProduto;
    }

    public void setAgrIdVendasProduto(int agrIdVendasProduto) {
        this.agrIdVendasProduto = agrIdVendasProduto;
    }

    public Double getAgrValorUnitario() {
        return agrValorUnitario;
    }

    public void setAgrValorUnitario(Double agrValorUnitario) {
        this.agrValorUnitario = agrValorUnitario;
    }

    public String getAgrFormaPagamento() {
        return agrFormaPagamento;
    }

    public void setAgrFormaPagamento(String agrFormaPagamento) {
        this.agrFormaPagamento = agrFormaPagamento;
    }

    public int getAgrFkClientes() {
        return agrFkClientes;
    }

    public void setAgrFkClientes(int agrFkClientes) {
        this.agrFkClientes = agrFkClientes;
    }

    public int getAgrFkVendedor() {
        return agrFkVendedor;
    }

    public void setAgrFkVendedor(int agrFkVendedor) {
        this.agrFkVendedor = agrFkVendedor;
    }
}
