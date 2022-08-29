package com.manytomany.resources;

import com.manytomany.entities.Materia;
import com.manytomany.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materia")
public class MateriaResource {
    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping
    public List<Materia> getMateria(){
        return materiaRepository.findAll();
    }

    @PostMapping
    public Materia saveMateria(@RequestBody Materia materia){
        return materiaRepository.save(materia);
    }

    @PutMapping
    public Materia updateMateria(@RequestBody Materia materia){
        if(materia != null && !materia.getId().isEmpty())
            return materiaRepository.save(materia);
        return null;
    }

    @DeleteMapping
    public void deleteMateria(@RequestBody Materia materia){
        if(materia != null && !materia.getId().isEmpty())
            materiaRepository.delete(materia);
    }

}
