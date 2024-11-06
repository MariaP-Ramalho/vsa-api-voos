package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.Embeddable;

import java.time.ZonedDateTime;

@Embeddable
public class Departure {
    private String DepAirport;
    private String DepDelay;
    private String depScheduledDateTime;

    public Departure(String depAirport, String depDelay, String depScheduledDateTime) {
        this.DepAirport = depAirport;
        this.DepDelay = depDelay;
        this.depScheduledDateTime = depScheduledDateTime;
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

    public String getDepScheduledDateTime() {
        return depScheduledDateTime;
    }

    public void setDepScheduledDateTime(String depScheduledDateTime) {
        this.depScheduledDateTime = depScheduledDateTime;
    }
}
