package com.example.apislaughterhouse.services;

import com.example.apislaughterhouse.models.Animal;
import com.example.apislaughterhouse.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AnimalServiceImpl implements AnimalService{

    AnimalRepository animalRepository;
    public AnimalServiceImpl(AnimalRepository animalRepository){
        this.animalRepository=animalRepository;
    }
    @Override
    public Animal create(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Iterable<Animal> findAllItr() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findById(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteById(Long id) {
    animalRepository.deleteById(id);
    }
}
