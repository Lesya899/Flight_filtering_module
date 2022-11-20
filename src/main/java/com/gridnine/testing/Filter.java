package com.gridnine.testing;

import java.util.List;

public interface Filter {
    //метод для вывода всех сегментов из списка перелетов
    void showFlights (List<Flight> fls);

    //метод для получения перелета до текущего момента времени
    List<Flight> DepartureUpToTheCurrentTime(List<Flight> fls);

    //метод для получения перелета с датой прилёта раньше даты вылета
    List<Flight> ArrivalDateBeforeDepartureDate(List<Flight> fls);

    //метод для получения перелета с общим временем, проведённым на земле превышающим два часа
    List<Flight> FlightTotalTimeMoreTwoHours(List<Flight> fls);


}

