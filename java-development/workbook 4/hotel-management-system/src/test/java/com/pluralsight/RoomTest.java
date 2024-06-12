package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void bookRoom_RoomAlreadyOccupied_ExpectFalse(){
        //arrange
        Guest guest1 = new Guest("Brya", 21);
        Room room = new Room(1403,"King");
        room.bookRoom(guest1);
        Guest guest2 = new Guest("Raymond",22);



        //act
       boolean result = room.bookRoom(guest2);

        //assert
        assertFalse(result, "Room should not be able to be booked while occupied.");
    }




}