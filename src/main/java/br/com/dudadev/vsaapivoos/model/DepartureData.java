package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DepartureData(@JsonAlias("airport") String DepAirport,
                            @JsonAlias("delay") String DepDelay,
                            @JsonAlias("timezone") String ArrTimeZone) {
}
