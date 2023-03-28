package com.example.apislaughterhouse.services;

import com.example.apislaughterhouse.models.Animal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AnimalService {

    Animal create(Animal animal);
    List<Animal> findAll();

    Iterable<Animal> findAllItr();

    Optional<Animal> findById(int id);
    Animal update(Animal animal);
    void deleteById(int id);
}
