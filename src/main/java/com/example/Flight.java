package com.example;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengerList;

    public Flight(String flightNumber, String destination, String origin) {
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.origin=origin;
        passengerList= new ArrayList <Passenger>();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }
    
    public String getDestination() {
        return this.destination;
    }

    public void bookPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void cancelPassenger(Passenger passenger) {
        passengerList.remove(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengerList;
    }

}

    // TODO: Implement methods to book a flight for a passenger and cancel a booking.
