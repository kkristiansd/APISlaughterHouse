package com.example.apislaughterhouse.models;

import jakarta.persistence.Column;

import java.util.Date;

public class Animal0 {
    private Long id;




    private double weight;


    private String registrationNumber;


    private String origin;

    public Animal0(Long id, double weight, String registrationNumber, String origin){
        this.id=id;

        this.weight=weight;
        this.registrationNumber=registrationNumber;
        this.origin=origin;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getOrigin() {
        return origin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Long getId() {
        return id;
    }


    public double getWeight() {
        return weight;
    }

}
