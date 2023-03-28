package com.example.apislaughterhouse.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="animals")
public class Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name="date")
    private LocalDate date;

    @Column(name = "weight")
    private double weight;

    @Column(name = "registrationNumber")
    private String registrationNumber;

    @Column(name = "origin")
    private String origin;


    public Animal(int id, double weight, String registrationNumber, String origin, LocalDate date){

        this.id= id;

        this.weight=weight;
        this.registrationNumber=registrationNumber;
        this.origin=origin;
        this.date=date;
    }

    public Animal() {

    }

    public Double getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}