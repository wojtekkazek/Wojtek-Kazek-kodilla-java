package com.kodilla.exception.test;

import java.util.Map;

public class FlightsFinder {

    public void findFlight(Flight flight, Map<String,Boolean> availableFlights) throws RouteNotFoundException {

        if (availableFlights.containsKey(flight.getArrivalAirport())) {
            if (availableFlights.get(flight.getArrivalAirport())) {
                System.out.println("fly");
            } else {
                throw new RouteNotFoundException("Requested airport is not available");
            }

        } else {
            throw new RouteNotFoundException("Requested airport is not in database");
        }

    }

}



