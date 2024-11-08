package br.com.dudadev.vsaapivoos.main;

import br.com.dudadev.vsaapivoos.model.Flight;
import br.com.dudadev.vsaapivoos.model.FlightData;
import br.com.dudadev.vsaapivoos.model.FlightsListData;
import br.com.dudadev.vsaapivoos.model.Priority;
import br.com.dudadev.vsaapivoos.repository.FlightRepository;
import br.com.dudadev.vsaapivoos.service.ConsumeApi;
import br.com.dudadev.vsaapivoos.service.ConvertData;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.scheduling.annotation.Scheduled;

public class Main {
    private final ConsumeApi consume = new ConsumeApi();
    private final ConvertData converter = new ConvertData();

    private final FlightRepository repository;

    public Main(FlightRepository repository) {
        this.repository = repository;
    }
    @Scheduled(fixedRate = 60000)
    public void runMain() {
        var json = consume.getData("https://api.aviationstack.com/v1/flights?access_key=db226550f98e936b720c595cc9ba99e3&dep_iata=BPS&min_delay_arr=60");
        FlightsListData flightsListData = converter.getData(json, FlightsListData.class);

        processFlights(flightsListData);

    }

    public void processFlights(FlightsListData flightsListData) {
        for (FlightData flightData : flightsListData.flights()) {
            Priority priority = Priority.fromNumber(flightData.arrivalData().arrDelay());

            Flight flight = new Flight(
                    flightData.flight_status(),
                    flightData.departureData(),
                    flightData.arrivalData(),
                    flightData.airlineData(),
                    flightData.flightNumberData(),
                    priority
            );
            try {
                repository.save(flight);
                System.out.println("Flight saved: " + flight);
            } catch (DataIntegrityViolationException e) {
                System.out.println("Duplicate flight not saved: " + flight);
            }
        }
    }
}
