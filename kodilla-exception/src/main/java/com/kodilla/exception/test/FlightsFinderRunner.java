package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsFinderRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("a", "d");

        FlightsFinder flightsFinder = new FlightsFinder();

        Map<String,Boolean> availableFlights = new HashMap<>();
        availableFlights.put("b", true);
        availableFlights.put("c", true);
        availableFlights.put("d", false);

        try {
            flightsFinder.findFlight(flight1, availableFlights);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

    }
}
