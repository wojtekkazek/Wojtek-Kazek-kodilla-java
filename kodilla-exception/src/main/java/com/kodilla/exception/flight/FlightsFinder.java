package com.kodilla.exception.flight;

import java.util.List;
import java.util.Map;

public class FlightsFinder {

    private Map<String, List<String>> flights;

    public FlightsFinder(Map<String, List<String>> flights) {
        this.flights = flights;
    }

    public boolean isFlightPossible(String departureAirport, String arrivalAirport) {

        if(flights.get(departureAirport) == null) {
            return false;
        }

        if(flights.get(departureAirport).contains(arrivalAirport)) {
            return true;
        }

        for (String anyDepartureAirport : flights.get(departureAirport)) {
            if (isFlightPossible(anyDepartureAirport, arrivalAirport)) {
                return true;
            }
        }

        return false;
    }
}
