package com.example;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengerlist;

    public Flight(String flightNumber, String destination, String origin) {
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.origin=origin;
        this.passengerlist= new ArrayList <Passenger> ();
    } 

    public void bookPassenger(Passenger passenger) {
        passengerlist.add(passenger);
    }

    public void cancelPassengers(Passenger passenger) {
        passengerlist.remove(passenger);
    }

    public String getFlightNumber() {
        return this.flightNumber;
    } 

    public String getDestination() {
        return this.destination;
    } 

    public String getOrigin() {
        return this.origin;
    }

    public List<Passenger> getPassengers() {
        return passengerlist;
    }
}

    // TODO: Implement methods to book a flight for a passenger and cancel a booking.
