package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_roomAvailable_() {
        //arrange
        Room room = new Room(1,139);

        room.setOccupied(false);
        room.setDirty(false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_roomOccupied_() {

        //arrange

        Room room = new Room(1,139);

        room.setOccupied(true);


        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertFalse(room.isDirty());
    }


    @Test
    public void checkIn_roomAvailableAndDirty_() {

        //arrange
        Room room = new Room(1,139);

        room.setOccupied(false);
        room.setDirty(true);

        //act
        room.checkIn();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_roomOccupiedAndDirty_() {

        //arrange
        Room room = new Room(1,139);

        room.setOccupied(true);
        room.setDirty(true);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }



    @Test
    void checkOut_roomOccupiedAndDirty_() {

        //arrange
        Room room = new Room(1,139);

        room.setOccupied(true);
        room.setDirty(true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());

    }

    @Test
    void checkOut_roomOccupiedNotDirty_() {

        //arrange
        Room room = new Room(1,139);

        room.setOccupied(true);
        room.setDirty(false);


        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());


    }



    @Test
    void cleanRoom_roomDirtyAndOccupied_() {
        //arrange
        Room room = new Room(1,139);

        room.setOccupied(true);
        room.setDirty(true);


        //act
        room.cleanRoom();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());




    }

    @Test
    void cleanRoom_roomDirtyNotOccupied_() {
        //arrange
        Room room = new Room(1,139);

        room.setOccupied(false);
        room.setDirty(true);


        //act
        room.cleanRoom();

        //assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

}