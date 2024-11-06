package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ArrivalData(@JsonAlias("airport") String arrAirport,
                          @JsonAlias("delay") String arrDelay) {
}
