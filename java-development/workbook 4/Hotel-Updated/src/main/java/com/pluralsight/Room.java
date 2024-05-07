package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    public void checkIn(Room room) {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
        } else {
            System.out.println("The room is not available for check-in.");
        }


    }

    public void checkOut (Room room ){
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
            System.out.println("Room checked out successfully.");

        } else {
            System.out.println("The room is not occupied.");
        }


    }

    public void cleanRoom(Room room){
        if (!isOccupied && isDirty){
            isDirty = false;
            System.out.println("Room has been cleaned.");

        }else {
            System.out.println("The room is not clean.");
        }

    }
}
