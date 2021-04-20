package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {
    @Test
    void whenAddedHotel_ItShouldReturnTrue() {
        Reservation reservation=new Reservation();
        Assertions.assertTrue(reservation.addHotel("Ashoka",3));

    }

}
