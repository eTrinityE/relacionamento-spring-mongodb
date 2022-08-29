package com.manytomany.resources;

import com.manytomany.entities.Aluno;
import com.manytomany.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAluno(){
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno saveAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @PutMapping
    public Aluno updateAluno(@RequestBody Aluno aluno){
        if(aluno != null && !aluno.getId().isEmpty())
            return alunoRepository.save(aluno);
        return null;
    }

    @DeleteMapping
    public void deleteAluno(@RequestBody Aluno aluno){
        if(aluno != null && !aluno.getId().isEmpty())
            alunoRepository.delete(aluno);
    }

}
