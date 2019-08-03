package com.kodilla.good.patterns.flights;

import java.util.List;


public class FlightsFinder {

    private List<Flight> flights;

    public FlightsFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public void lookForFlight (String departureAirport, String arrivalAirport) {

        if (isFlightPossible(departureAirport, arrivalAirport)) {
            System.out.println("Travel from " + departureAirport + " to " + arrivalAirport + " is available");
        } else {
            System.out.println("Travel from " + departureAirport + " to " + arrivalAirport + " is not available");
        }

    }

    public boolean isFlightPossible(String departureAirport, String arrivalAirport) {

                for (Flight flight : flights) {

            if (flight.getDepartureAirport() == departureAirport) {

                if (flight.getArrivalAirport() == arrivalAirport) {
                    return true;
                }

                if (isFlightPossible(flight.getArrivalAirport(), arrivalAirport)) {
                    return true;
                }

            }

        }

        return false;
    }

    public void showDirectFlightsFromDestination(List<Flight> flights, String departureAirport) {

            System.out.println("Available flights from " + departureAirport + ":");
            flights.stream()
                    .filter(flight -> flight.getDepartureAirport() == departureAirport)
                    .forEach(System.out::println);
    }

    public void showDirectFlightsToDestination(List<Flight> flights, String arrivalAirport) {

        System.out.println("Available flights to " + arrivalAirport + ":");
        flights.stream()
                .filter(flight -> flight.getArrivalAirport() == arrivalAirport)
                .forEach(System.out::println);
    }

}
