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
public class AgrProdutos {
    private int agrIdFilme;
    private String agrTitulo;
    private String agrPlataforma;
    private String agrGenero;
    private Double agrPreco;
    private Date agrAnoLancamento;
    private int agrFkFornecedores;

    public int getAgrIdFilme() {
        return agrIdFilme;
    }

    public void setAgrIdFilme(int agrIdFilme) {
        this.agrIdFilme = agrIdFilme;
    }

    public String getAgrTitulo() {
        return agrTitulo;
    }

    public void setAgrTitulo(String agrTitulo) {
        this.agrTitulo = agrTitulo;
    }

    public String getAgrPlataforma() {
        return agrPlataforma;
    }

    public void setAgrPlataforma(String agrPlataforma) {
        this.agrPlataforma = agrPlataforma;
    }

    public String getAgrGenero() {
        return agrGenero;
    }

    public void setAgrGenero(String agrGenero) {
        this.agrGenero = agrGenero;
    }

    public Double getAgrPreco() {
        return agrPreco;
    }

    public void setAgrPreco(Double agrPreco) {
        this.agrPreco = agrPreco;
    }

    public Date getAgrAnoLancamento() {
        return agrAnoLancamento;
    }

    public void setAgrAnoLancamento(Date agrAnoLancamento) {
        this.agrAnoLancamento = agrAnoLancamento;
    }

    public int getAgrFkFornecedores() {
        return agrFkFornecedores;
    }

    public void setAgrFkFornecedores(int agrFkFornecedores) {
        this.agrFkFornecedores = agrFkFornecedores;
    }
}
