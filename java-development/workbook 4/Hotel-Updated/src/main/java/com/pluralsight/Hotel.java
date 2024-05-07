package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = 0;
        this.numberOfRooms = 0;

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedRooms = bookedRooms;
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
        int totalAvailableRooms = numberOfRooms + (isSuite ? numberOfSuites : numberOfRooms);
        int availableRooms = totalAvailableRooms - bookedRooms;
        if (availableRooms >= numberOfRooms && numberOfRooms > 0) {
            bookedRooms += numberOfRooms;
            System.out.println("Rooms booked successfully.");
            return true;
        } else {
            System.out.println("Insufficient rooms available for booking.");
            return false;

        }

    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedRooms;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }
}
