package com.onetomany.resources;

import com.onetomany.entities.Pessoa;
import com.onetomany.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
    @Autowired
    private PessoaRepository pessoaRepository;

    //Read
    @GetMapping
    public List<Pessoa> getPessoa(){
        return pessoaRepository.findAll();
    }

    //Create
    @PostMapping
    public Pessoa savePessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    //Update
    @PutMapping
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa){
        if(pessoa != null && !pessoa.getId().isEmpty()){
            return pessoaRepository.save(pessoa);
        }else {
            return null;
        }
    }

    //Delete
    public void deletePessoa(@RequestBody Pessoa pessoa){
        if(pessoa != null & !pessoa.getId().isEmpty()){
            pessoaRepository.delete(pessoa);
        }
    }
}
