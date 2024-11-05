package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class FlightNumber {
    private String flightNumber;

    public FlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public FlightNumber() {

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
