package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FlightData (@JsonAlias("flight_status") String flight_status,
                          @JsonAlias("departure") DepartureData departureData,
                          @JsonAlias("arrival") ArrivalData arrivalData,
                          @JsonAlias("airline") AirlineData airlineData,
                          @JsonAlias("flight") FlightNumberData flightNumberData){
}
