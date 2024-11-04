package br.com.dudadev.vsaapivoos.main;

import br.com.dudadev.vsaapivoos.service.ConsumeApi;
import br.com.dudadev.vsaapivoos.service.ConvertData;

public class Main {
    private final ConsumeApi consume = new ConsumeApi();
    private final ConvertData converter = new ConvertData();

    public void displayMain() {

        var json = consume.getData("https://api.aviationstack.com/v1/flights?access_key=db226550f98e936b720c595cc9ba99e3&dep_iata=GRU&min_delay_arr=60");
        return converter.getData(json, TvSeriesData.class);
    }
}
