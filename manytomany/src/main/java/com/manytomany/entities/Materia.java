package com.manytomany.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "materia")
public class Materia {
    @Id
    private String id;
    private String nome;
    private String cargahoraria;
    private String nomeProfessor;
    @DBRef
    @JsonBackReference
    private List<Aluno> aluno;

    public Materia(String id, String nome, String cargahoraria, String nomeProfessor, List<Aluno> aluno) {
        this.id = id;
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.nomeProfessor = nomeProfessor;
        this.aluno = aluno;
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

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }
}
