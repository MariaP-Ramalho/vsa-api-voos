package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DepartureData(@JsonAlias("airport") String depAirport,
                            @JsonAlias("delay") int depDelay,
                            @JsonAlias("timezone") String timeZone,
                            @JsonAlias("scheduled") String depScheduledDateTime) {
}
