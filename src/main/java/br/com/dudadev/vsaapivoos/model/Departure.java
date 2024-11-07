package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Departure {
    private String DepAirport;
    private int DepDelay;
    private String depScheduledDateTime;
    private String timeZone;

    public Departure(String depAirport, int depDelay, String depScheduledDateTime, String timeZone) {
        this.DepAirport = depAirport;
        this.DepDelay = depDelay;
        this.depScheduledDateTime = depScheduledDateTime;
        this.timeZone = timeZone;
    }

    public Departure() {

    }

    public String getDepAirport() {
        return DepAirport;
    }

    public void setDepAirport(String depAirport) {
        DepAirport = depAirport;
    }

    public int getDepDelay() {
        return DepDelay;
    }

    public void setDepDelay(int depDelay) {
        DepDelay = depDelay;
    }

    public String getDepScheduledDateTime() {
        return depScheduledDateTime;
    }

    public void setDepScheduledDateTime(String depScheduledDateTime) {
        this.depScheduledDateTime = depScheduledDateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
