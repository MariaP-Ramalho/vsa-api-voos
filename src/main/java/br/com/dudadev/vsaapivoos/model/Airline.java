package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Airline {
    private String arilineName;

    public Airline(String arilineName) {
        this.arilineName = arilineName;
    }

    public Airline() {

    }

    public String getArilineName() {
        return arilineName;
    }

    public void setArilineName(String arilineName) {
        this.arilineName = arilineName;
    }
}
