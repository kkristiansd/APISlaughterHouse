package com.example.apislaughterhouse.controllers;

import com.example.apislaughterhouse.models.Animal0;
import com.example.apislaughterhouse.repository.AnimalRepository;
import com.example.apislaughterhouse.repository.AnimalRepository0;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController0 {
    private AnimalRepository0 animalRepo;

    public AnimalController0(AnimalRepository0 animalRepo){
        this.animalRepo=animalRepo;
    }

    // @GetMapping can be used as well -- see the main controller
    @RequestMapping(value = "/animals/{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
    @ResponseBody
    public Animal0 getAnimalById(@PathVariable int id) {
        return animalRepo.findById(id);
    }

    @RequestMapping(value = "/animals", //
            method = RequestMethod.GET, //,
            produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public List<Animal0> getAllAnimals() {
        List<Animal0> list = animalRepo.findAll();
        return list;
    }

    @RequestMapping(value = "/animals",
            method = RequestMethod.POST)
    @ResponseBody
    public Animal0 createAnimal(@RequestBody Animal0 animal) {
        return animalRepo.save(animal);
    }


}
