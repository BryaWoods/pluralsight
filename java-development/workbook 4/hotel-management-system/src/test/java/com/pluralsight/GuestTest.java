package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    public void checkIn_GuestChecksIn_ExpectedTrue(){
        //arrange

        Guest guest1 = new Guest("Brya",26);
        guest1.checkIn();

        //act
        boolean result = guest1.isCheckedIn();

        //assert
        assertTrue(result);
    }

    @Test
    public void checkIn_GuestChecksOut_ExpectedFalse(){
        //arrange

        Guest guest1 = new Guest("Brya",26);
        guest1.checkIn();

        //act
        guest1.checkOut();
        boolean result = guest1.isCheckedIn();

        //assert
        assertFalse(result);
    }



}