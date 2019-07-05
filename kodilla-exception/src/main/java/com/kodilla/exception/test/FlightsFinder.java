package com.kodilla.exception.test;

        import java.util.ArrayList;
        import java.util.List;

public class FlightsFinder {

    private List<Flight> possibleFlights = new ArrayList<>();

    public boolean findFlight(Flight flight, List<Flight> availableFlights, int noOfChanges) {

        for(Flight anyFlight: availableFlights) {
            if(anyFlight.getDepartureAirport().equals(flight.getDepartureAirport())) {
                possibleFlights.add(anyFlight);
                if(noOfChanges>0) {
                    findFlightRecursion(anyFlight, availableFlights, 101-noOfChanges);
                }
            }
        }
/*
        for(Flight flightToPrint: possibleFlights) {
            System.out.println(flightToPrint);
        }

 */

        for(Flight anyPossibleFlight: possibleFlights) {
            if(anyPossibleFlight.getArrivalAirport().equals(flight.getArrivalAirport())) {
                return true;
            }
        }

        return false;

    }

    private void findFlightRecursion(Flight flight, List<Flight> availableFlights, int depth) {

        for(Flight anyFlight: availableFlights) {
            if(anyFlight.getDepartureAirport().equals(flight.getArrivalAirport())) {
                possibleFlights.add(anyFlight);
                if(depth<100)
                    findFlightRecursion(anyFlight, availableFlights, ++depth);
            }
        }

    }

}