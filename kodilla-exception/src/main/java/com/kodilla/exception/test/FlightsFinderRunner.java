package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightsFinderRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("WAW", "KRK");

        List<Flight> availableFlights = new ArrayList<>();
        availableFlights.add(new Flight("WAW","GDN"));
        availableFlights.add(new Flight("WAW","WRO"));
        availableFlights.add(new Flight("WRO","KTW"));
        availableFlights.add(new Flight("KTW","KRK"));
        availableFlights.add(new Flight("GDN","SZZ"));
        availableFlights.add(new Flight("SZZ","POZ"));
        availableFlights.add(new Flight("POZ","KRK"));
        availableFlights.add(new Flight("KRK","WRO"));

        FlightsFinder flightsFinder = new FlightsFinder();

        for(Flight flight: availableFlights) {
            System.out.println(flight);
        }

        System.out.println();



        if(flightsFinder.findFlight(flight1, availableFlights, 2)) {
            System.out.println("Connection is available");
        } else {
            System.out.println("Connection is not available, try with more flight changes");
        }

    }
}
