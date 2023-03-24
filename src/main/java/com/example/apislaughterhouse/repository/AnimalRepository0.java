package com.example.apislaughterhouse.repository;

import com.example.apislaughterhouse.models.Animal0;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AnimalRepository0 {
    private static final Map<Long, Animal0> orderMap = new HashMap<>();
    static {
        initDataSource();
    }
    private static void initDataSource() {
        Animal0 a1 = new Animal0(1L,2,"a124","lv");
        Animal0 a2 = new Animal0(1L,2,"a124","lv");
        Animal0 a3 = new Animal0(1L,2,"a124","lv");


        orderMap.put(a1.getId(), a1);
        orderMap.put(a2.getId(), a2);
        orderMap.put(a3.getId(), a3);
    }
// CRUD operations (later we inherit from interface ()CrudRepo or JpaRepo)

    // C - Create
    public Animal0 save(Animal0 a){
        orderMap.put(a.getId(), a);
        return a;
    }

    // R - GET
    public Animal0 findById(Long id) {
        return orderMap.get(id);
    }

    // U - Update
    public Animal0 update(Animal0 o){
        // simply saves the object
        orderMap.put(o.getId(), o);
        return o;
    }
    // D - Delete
    public void deleteById(Long id) { // void just for test
        orderMap.remove(id);
    }

    // R - find all
    public List<Animal0> findAll() {
        Collection<Animal0> c = orderMap.values();
        List<Animal0> orderList = new ArrayList<>();
        orderList.addAll(c);
        return orderList;
    }
}


