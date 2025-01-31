package com.steeltruedrum.java.merion.lesson28;

import com.steeltruedrum.java.merion.lesson8.Flight;

public class AnonClass {
    public static void run() {
        Flight flight = new Flight() {
            @Override
            public void takeOff() {
                System.out.println("Flight.takeOff");
            }

            @Override
            public void landing() {
                System.out.println("Flight.landing");
            }
        };
        flight.landing();
        flight.takeOff();
    };
}
