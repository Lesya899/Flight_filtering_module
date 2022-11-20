package com.gridnine.testing;

//Класс, в котором создаем  данные для тестирования

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


class FlightInformationTest {
    private static final LocalDateTime CURRENT_DATE = LocalDateTime.now().plusDays(3);


    //Обычный четырехчасовой перелет
    public static Flight normalFlight = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(4))
    ));

    //Обычный перелет, состоящий из 2-х сегментов
    public static Flight flightTwoSegments = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(3), CURRENT_DATE.plusHours(7))
    ));

    //Перелет, в котором дата вылета предшествует текущей дате
    public static  Flight departureThePast1 = new Flight(List.of(
            new Segment(CURRENT_DATE.minusDays(4), CURRENT_DATE)
    ));

    //Еще один перелет, в котором дата вылета предшествует текущей дате
    public static  Flight departureThePast2 = new Flight(List.of(
            new Segment(CURRENT_DATE.minusWeeks(1), CURRENT_DATE)
    ));

    //Перелет, в котором время прилета раньше времени вылета
    public static  Flight arrivalBeforeDeparture1 = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.minusHours(8))
    ));

    //Перелет, в котором у одного сегмента время прилета предшествует времени вылета
    public static Flight arrivalBeforeDeparture2 = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(3)),
            new Segment(CURRENT_DATE.plusHours(5), CURRENT_DATE.plusHours(4)),
            new Segment(CURRENT_DATE.plusHours(6), CURRENT_DATE.plusHours(8))
    ));

    //Перелет с временем между пересадками более 2-х часов
    public static  Flight moreTwoHours1 = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(5), CURRENT_DATE.plusHours(6))
    ));

    //Перелет с временем между пересадками более 2-х часов
    public static  Flight moreTwoHours2 = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(3), CURRENT_DATE.plusHours(5)),
            new Segment(CURRENT_DATE.plusHours(8), CURRENT_DATE.plusHours(9))
    ));

    /**
     * Cоздаем списки actual,  в них помещаем данные для сравнения - то что мы предпологаем
     * должны вернуть методы фильтрации перелетов
     */
    public static  List<Flight> allFlight = Arrays.asList(normalFlight, flightTwoSegments, departureThePast1, departureThePast2, arrivalBeforeDeparture1, arrivalBeforeDeparture2, moreTwoHours1, moreTwoHours2);
    public static  List<Flight> actualListDepartureThePast = Arrays.asList(departureThePast1, departureThePast2);
    public static  List<Flight> actualListArrivalBeforeDeparture = Arrays.asList(arrivalBeforeDeparture1, arrivalBeforeDeparture2);
    public static  List<Flight> actualListMoreTwoHours = Arrays.asList(moreTwoHours1,moreTwoHours2);
}










