package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Embeddable;

@Embeddable
public class Departure {
    private String DepAirport;
    private String DepDelay;
    private String ArrTimeZone;

    public Departure(String depAirport, String depDelay, String depTimeZone) {
        this.DepAirport = depAirport;
        this.DepDelay = depDelay;
        this.ArrTimeZone = depTimeZone;
    }

    public Departure() {

    }

    public String getDepAirport() {
        return DepAirport;
    }

    public void setDepAirport(String depAirport) {
        DepAirport = depAirport;
    }

    public String getDepDelay() {
        return DepDelay;
    }

    public void setDepDelay(String depDelay) {
        DepDelay = depDelay;
    }

    public String getArrTimeZone() {
        return ArrTimeZone;
    }

    public void setArrTimeZone(String arrTimeZone) {
        ArrTimeZone = arrTimeZone;
    }
}
