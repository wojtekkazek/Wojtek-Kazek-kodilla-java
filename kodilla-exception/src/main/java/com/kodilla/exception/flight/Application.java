package com.kodilla.exception.flight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String args[]) {

        Map<String, List<String>> map = new HashMap<>();

        map.put("Katowice", Arrays.asList("Warszawa", "Wroclaw"));
        map.put("Wroclaw", Arrays.asList("Gdansk", "Poznan"));
        map.put("Gdansk", Arrays.asList("Szczecin", "Krakow"));

        FlightsFinder flightsFinder = new FlightsFinder(map);

        boolean result = flightsFinder.isFlightPossible("Katowice", "Krakow");
        System.out.print(result);

    }

}
