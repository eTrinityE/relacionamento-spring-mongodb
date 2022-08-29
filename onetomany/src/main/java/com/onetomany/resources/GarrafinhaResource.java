package com.onetomany.resources;

import com.onetomany.entities.Garrafinha;
import com.onetomany.repositories.GarrafinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class GarrafinhaResource {
    @Autowired
    private GarrafinhaRepository garrafinhaRepository;

    //Read
    @GetMapping
    public List<Garrafinha> getGarrafinha(){
        return garrafinhaRepository.findAll();
    }

    //Create
    @PostMapping
    public Garrafinha saveGarrafinha(@RequestBody Garrafinha garrafinha){
        return garrafinhaRepository.save(garrafinha);
    }

    //Update
    @PutMapping
    public Garrafinha updateGarrafinha(@RequestBody Garrafinha garrafinha){
        if(garrafinha != null && !garrafinha.getId().isEmpty()){
            return garrafinhaRepository.save(garrafinha);
        }else {
            return null;
        }
    }

    //Delete
    public void deleteGarrafinha(@RequestBody Garrafinha garrafinha){
        if(garrafinha != null & !garrafinha.getId().isEmpty()){
            garrafinhaRepository.delete(garrafinha);
        }
    }
}
