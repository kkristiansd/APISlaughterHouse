package com.example.apislaughterhouse.repository;

import com.example.apislaughterhouse.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
