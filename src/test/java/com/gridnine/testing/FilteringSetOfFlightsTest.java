package com.gridnine.testing;



import org.junit.jupiter.api.Test;
import java.util.List;
import static com.gridnine.testing.FlightInformationTest.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FilteringSetOfFlightsTest {
    Filter filterSegment = new FilteringSetOfFlights();


    @Test
    void departureUpToTheCurrentTime() {

        //создаем список "ожидаемый результат" и заполняем его данными нашего метода
        List<Flight> expected = filterSegment.DepartureUpToTheCurrentTime(allFlight);
        assertEquals(expected, actualListDepartureThePast);
    }

    @Test
    void arrivalDateBeforeDepartureDate() {
        List<Flight> expected = filterSegment.ArrivalDateBeforeDepartureDate(allFlight);
        assertEquals(expected, actualListArrivalBeforeDeparture);
    }

    @Test
    void flightTotalTimeMoreTwoHours() {
        List<Flight> expected = filterSegment.FlightTotalTimeMoreTwoHours(allFlight);
        assertEquals(expected, actualListMoreTwoHours);
    }
}