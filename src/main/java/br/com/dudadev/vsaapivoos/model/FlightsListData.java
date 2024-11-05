package br.com.dudadev.vsaapivoos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record FlightsListData(@JsonAlias("data") List<FlightData> flights){
}
