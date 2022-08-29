package com.onetoone.resources;

import com.onetoone.repositories.PessoaRepository;
import com.onetoone.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaResources {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> getPessoas() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa setPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @PutMapping
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa) {

        if (pessoa != null && !pessoa.getId().isEmpty()) {
            return pessoaRepository.save(pessoa);
        }
        return null;
    }

    @DeleteMapping
    public void deletePessoa(@RequestBody Pessoa pessoa) {
        if (pessoa != null && !pessoa.getId().isEmpty()) {
            pessoaRepository.delete(pessoa);
        }
    }

}
