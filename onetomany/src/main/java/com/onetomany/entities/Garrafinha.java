package com.onetomany.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "garrafinha")
public class Garrafinha {
    @Id
    private String id;
    private String marca;
    private String cor;
    @DBRef
    private List<Pessoa> pessoa;

    public Garrafinha(String id, String marca, String cor, List<Pessoa> pessoa) {
        this.id = id;
        this.marca = marca;
        this.cor = cor;
        this.pessoa = pessoa;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }
}