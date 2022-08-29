package com.manytomany.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "aluno")
public class Aluno {
    @Id
    private String id;
    private String nome;
    private String cpf;
    @DBRef
    @JsonManagedReference
    private List<Materia> materia;

    public Aluno(String id, String nome, String cpf, List<Materia> materia) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.materia = materia;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }
}
