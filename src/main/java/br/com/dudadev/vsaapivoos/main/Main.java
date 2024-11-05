package br.com.dudadev.vsaapivoos.main;

import br.com.dudadev.vsaapivoos.model.Flight;
import br.com.dudadev.vsaapivoos.model.FlightData;
import br.com.dudadev.vsaapivoos.model.FlightsListData;
import br.com.dudadev.vsaapivoos.repository.FlightRepository;
import br.com.dudadev.vsaapivoos.service.ConsumeApi;
import br.com.dudadev.vsaapivoos.service.ConvertData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final ConsumeApi consume = new ConsumeApi();
    private final ConvertData converter = new ConvertData();

    private FlightRepository repository;

    public Main(FlightRepository repository) {
        this.repository = repository;
    }

    public void displayMain() {
        var json = consume.getData("https://api.aviationstack.com/v1/flights?access_key=db226550f98e936b720c595cc9ba99e3&min_delay_arr=60");
        FlightsListData flightsListData = converter.getData(json, FlightsListData.class);

        processFlights(flightsListData);

    }

    public void processFlights(FlightsListData flightsListData) {
        for (FlightData flightData : flightsListData.flights()) {
            // Cria um novo objeto Flight para cada entrada de FlightData
            Flight flight = new Flight(
                    flightData.flight_status(),
                    flightData.departureData(),
                    flightData.arrivalData(),
                    flightData.airlineData(),
                    flightData.flightNumberData()
            );
            repository.save(flight);
            System.out.println(flight); // Exemplo de operação com o objeto Flight
        }
    }
}
