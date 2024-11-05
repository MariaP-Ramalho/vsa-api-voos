package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Embeddable;

@Embeddable
public class Arrival {
    private String arrAirport;
    private String arrDelay;
    private String arrTimeZone;

    public Arrival(String arrAirport, String arrDelay, String arrTimeZone) {
        this.arrAirport = arrAirport;
        this.arrDelay = arrDelay;
        this.arrTimeZone = arrTimeZone;
    }

    public Arrival() {

    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getArrDelay() {
        return arrDelay;
    }

    public void setArrDelay(String arrDelay) {
        this.arrDelay = arrDelay;
    }

    public String getArrTimeZone() {
        return arrTimeZone;
    }

    public void setArrTimeZone(String arrTimeZone) {
        this.arrTimeZone = arrTimeZone;
    }
}
