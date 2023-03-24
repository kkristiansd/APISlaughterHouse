package com.example.apislaughterhouse.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class RestApiController {

    @PostMapping("/animals")  // C endpoint
    public String createAnimal() {
        System.out.println("\n [Backend - Server] create operation is reached");
        return "HTTP POST - Create";
    }

    @GetMapping("/animals/{id}")  // R endpoint
    public String getAnimal() {
        System.out.println("\n [Backend - Server] Read operation is reached");
        return "HTTP GET - Read";
    }

    @PutMapping("/animals/{id}")  // U endpoint
    public String updateAnimal() {
        System.out.println("\n [Backend - Server] update operation is reached");
        return "HTTP PUT - Update";
    }

    @DeleteMapping("/animals/{id}")  // D endpoint
    public String deleteAnimal() {
        System.out.println("\n [Backend - Server] delete operation is reached");
        return "HTTP DELETE - Delete";
    }

}
