package com.example.apislaughterhouse.controllers;

import com.example.apislaughterhouse.models.Animal;
import com.example.apislaughterhouse.services.AnimalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AnimalController {

    private Logger logger = LoggerFactory.getLogger(AnimalController.class);
    private AnimalServiceImpl animalService;
    public AnimalController(AnimalServiceImpl animalService) {
        this.animalService = animalService;
    }

    // CRUD endpoint follows

    // http://localhost:8090/api/orders
    @PostMapping("/animals")
    public ResponseEntity<Object> createAnimal(@RequestBody Animal animal){
        try {
            Animal createdAnimal = animalService.create(animal);
            return new ResponseEntity<Object>(createdAnimal, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals")
    public ResponseEntity<Object> getAllAnimals(){
        try {
            List<Animal> orders = animalService.findAll();
            return new ResponseEntity<Object>(orders, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //@GetMapping("/orders/{id}")  // can include MediaType as well
    @GetMapping(value="/animals/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalById(@PathVariable("id") Long id){
        try {
            Optional<Animal> animal = animalService.findById(id);
            if (animal.isPresent()) {
                return new ResponseEntity<Object>(animal.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/animals/{id}")
    public ResponseEntity<Object> updateAnimals(@PathVariable("id") Long id, @RequestBody Animal animal){
        try {
            animal.setId(id);
            Animal savedAnimal = animalService.update(animal);
            return new ResponseEntity<Object>(savedAnimal, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/animals/{id}")
    public ResponseEntity<HttpStatus> deleteAnimal(@PathVariable("id") Long id){
        try {
            animalService.deleteById(id);
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
        }
    }
}


