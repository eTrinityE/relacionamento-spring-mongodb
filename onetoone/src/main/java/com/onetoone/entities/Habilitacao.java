package com.onetoone.entities;

public class Habilitacao {
    private String numero;
    private String categoria;
    private String dataVencimento;

    public Habilitacao(String numero, String categoria, String dataVencimento) {
        this.numero = numero;
        this.categoria = categoria;
        this.dataVencimento = dataVencimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
