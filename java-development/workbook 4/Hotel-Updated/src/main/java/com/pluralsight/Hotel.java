package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedRooms;
    private int bookedSuites;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedRooms, int bookedSuites) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedRooms = bookedRooms;
        this.bookedSuites = bookedSuites;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= numberOfRooms) {
                bookedSuites += numberOfRooms;
                System.out.println("Rooms booked successfully.");
                return true;
            } else {
                return false;
            }
        } else {
            if (bookedRooms + numberOfRooms <= numberOfRooms) {
                bookedRooms += numberOfRooms;
                System.out.println("Rooms booked successfully.");
                return true;
            } else {
                System.out.println("Insufficient rooms available for booking.");
                return false;
            }

        }
    }


    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }
}
