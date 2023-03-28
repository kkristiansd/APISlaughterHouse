package com.example.apislaughterhouse.models;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.Date;

public class Animal0 {
    private int id;

    private double weight;


    private String registrationNumber;


    private String origin;

    private LocalDate date;

    public Animal0(int id, double weight, String registrationNumber, String origin, LocalDate date){
        this.id=id;
        this.weight=weight;
        this.registrationNumber=registrationNumber;
        this.origin=origin;
        this.date=date;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getId() {
        return id;
    }


    public double getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return date;
    }
}
