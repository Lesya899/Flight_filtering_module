package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        Filter fil = new FilteringSetOfFlights();

        System.out.println("All flights:");
        fil.showFlights(flights);
        System.out.println();

        System.out.println("Segments with a departure date prior to the current point in time:");
        fil.DepartureUpToTheCurrentTime(flights);
        System.out.println();

        System.out.println("Segments with an arrival date earlier than the departure date:");
        fil.ArrivalDateBeforeDepartureDate(flights);
        System.out.println();

        System.out.println("Segments with total time spent on the ground in excess of two hours:");
        fil.FlightTotalTimeMoreTwoHours(flights);
        System.out.println();
    }
}

