package com.example.slaugherhouse.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;

    private double weight;

    private String registrationNumber;

    private String origin;


    public Animal(long id, Date date, double weight, String registrationNumber, String origin){

        this.id= id;
        this.date =date;
        this.weight=weight;
        this.registrationNumber=registrationNumber;
        this.origin=origin;
    }

    public Animal() {

    }

    public Double getWeight() {
        return weight;
    }

    public Date getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long id) {
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
}