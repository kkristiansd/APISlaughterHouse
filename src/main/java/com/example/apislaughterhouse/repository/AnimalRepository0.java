package com.example.apislaughterhouse.repository;

import com.example.apislaughterhouse.models.Animal0;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class AnimalRepository0 {
    private static final Map<Integer, Animal0> animalMap = new HashMap<>();
    static {
        initDataSource();
    }
    private static void initDataSource() {
        Animal0 a1 = new Animal0(1,2,"a124","lv", LocalDate.of(2023,3,11));
        Animal0 a2 = new Animal0(5,2.5,"b24","dk", LocalDate.of(2033,9,1));
        Animal0 a3 = new Animal0(11,5.5,"c1124","rus", LocalDate.of(2055,1,10));


        animalMap.put(a1.getId(), a1);
        animalMap.put(a2.getId(), a2);
        animalMap.put(a3.getId(), a3);
    }
// CRUD operations (later we inherit from interface ()CrudRepo or JpaRepo)

    // C - Create
    public Animal0 save(Animal0 a){
        animalMap.put(a.getId(), a);
        return a;
    }

    // R - GET
    public Animal0 findById(Integer id) {
        return animalMap.get(id);
    }

    // U - Update
    public Animal0 update(Animal0 o){
        // simply saves the object
        animalMap.put(o.getId(), o);
        return o;
    }
    // D - Delete
    public void deleteById(Integer id) { // void just for test
        animalMap.remove(id);
    }

    // R - find all
    public List<Animal0> findAll() {
        Collection<Animal0> c = animalMap.values();
        List<Animal0> animalList = new ArrayList<>();
        animalList.addAll(c);
        return animalList;
    }
}


