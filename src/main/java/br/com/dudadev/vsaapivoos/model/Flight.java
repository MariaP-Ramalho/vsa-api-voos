package br.com.dudadev.vsaapivoos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String flightStatus;
    @Embedded
    private AirlineData airlineData;
    @Embedded
    private FlightNumberData flightNumberData;
    @Embedded
    private DepartureData departureData;
    @Embedded
    private ArrivalData arrivalData;

    public Flight(String flightStatus, DepartureData departureData, ArrivalData arrivalData, AirlineData airlineData, FlightNumberData flightNumberData) {
        this.flightStatus = flightStatus;
        this.departureData = departureData;
        this.arrivalData = arrivalData;
        this.airlineData = airlineData;
        this.flightNumberData = flightNumberData;
    }

    public Flight() {

    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public DepartureData getDepartureData() {
        return departureData;
    }

    public void setDepartureData(DepartureData departureData) {
        this.departureData = departureData;
    }

    public ArrivalData getArrivalData() {
        return arrivalData;
    }

    public void setArrivalData(ArrivalData arrivalData) {
        this.arrivalData = arrivalData;
    }

    public AirlineData getAirlineData() {
        return airlineData;
    }

    public void setAirlineData(AirlineData airlineData) {
        this.airlineData = airlineData;
    }

    public FlightNumberData getFlightNumberData() {
        return flightNumberData;
    }

    public void setFlightNumberData(FlightNumberData flightNumberData) {
        this.flightNumberData = flightNumberData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightStatus='" + flightStatus + '\'' +
                ", departureData=" + departureData +
                ", arrivalData=" + arrivalData +
                ", airlineData=" + airlineData +
                ", flightNumberData=" + flightNumberData +
                '}';
    }

}
