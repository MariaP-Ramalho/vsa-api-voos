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

import java.util.List;

public class Main {
    private final ConsumeApi consume = new ConsumeApi();
    private final ConvertData converter = new ConvertData();

    private final FlightRepository repository;

    private final String API_KEY = "f1008c6a24ec5e2e3c79ccb743fff302";

    private final String ADRESS = "https://api.aviationstack.com/v1/flights?access_key=" + API_KEY + "&min_delay_arr=60&dep_iata=";


    public Main(FlightRepository repository) {
        this.repository = repository;
    }
    @Scheduled(fixedRate = 900000)
    public void runMain() {
        List<String> iataCodes = List.of("GRU", "CGH", "VCP", "SSA", "IOS");

        for (String iataCode : iataCodes) {
            String url = ADRESS + iataCode;
            var json = consume.getData(url);
            FlightsListData flightsListData = converter.getData(json, FlightsListData.class);
            processFlights(flightsListData);
            System.out.println("---------------------------DADOS ENVIADOS DO AEROPORTO: " + iataCode + "--------------------------------");
        }
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
