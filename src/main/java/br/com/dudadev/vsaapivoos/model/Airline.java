package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Airline {
    private String airlineName;

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public Airline() {

    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
