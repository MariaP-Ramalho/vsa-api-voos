package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DepartureData(@JsonAlias("airport") String depAirport,
                            @JsonAlias("delay") String depDelay,
                            @JsonAlias("timezone") String depTimeZone) {
}
