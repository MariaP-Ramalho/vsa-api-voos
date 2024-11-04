package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FlightData (@JsonAlias("flight_status") String flight_status,
                          @JsonAlias("airport") String airport,
                          @JsonAlias("delay") String delat){
}
