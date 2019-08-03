package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String args[]) {

        List<Flight> availableFlights = new ArrayList<>();
        availableFlights.add(new Flight("WAW","GDN"));
        availableFlights.add(new Flight("WAW","WRO"));
        availableFlights.add(new Flight("WRO","KTW"));
        availableFlights.add(new Flight("KTW","KRK"));
        availableFlights.add(new Flight("GDN","SZZ"));
        availableFlights.add(new Flight("SZZ","POZ"));
        availableFlights.add(new Flight("POZ","KRK"));
        availableFlights.add(new Flight("KRK","WRO"));

        FlightsFinder flightsFinder = new FlightsFinder(availableFlights);

        flightsFinder.lookForFlight("WAW", "KRK");

        System.out.println();
        flightsFinder.showDirectFlightsFromDestination(availableFlights, "WAW");

        System.out.println();
        flightsFinder.showDirectFlightsToDestination(availableFlights, "WRO");

    }
}
