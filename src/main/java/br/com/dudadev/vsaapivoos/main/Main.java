package br.com.dudadev.vsaapivoos.main;

import br.com.dudadev.vsaapivoos.model.FlightsData;
import br.com.dudadev.vsaapivoos.service.ConsumeApi;
import br.com.dudadev.vsaapivoos.service.ConvertData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final ConsumeApi consume = new ConsumeApi();
    private final ConvertData converter = new ConvertData();

    public void displayMain() {

        List<FlightsData> flights = new ArrayList<>();

        var json = consume.getData("https://api.aviationstack.com/v1/flights?access_key=db226550f98e936b720c595cc9ba99e3&dep_iata=GRU&min_delay_arr=60");

        FlightsData seasonData = converter.getData(json, FlightsData.class);
        flights.add(seasonData);
        flights.forEach(System.out::println);
    }
}
