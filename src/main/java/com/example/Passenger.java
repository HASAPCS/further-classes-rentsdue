package com.example;

public class Passenger {
    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name=name;
        this.passportNumber=passportNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPassportNumber() {
        return this.passportNumber;
    }
}
