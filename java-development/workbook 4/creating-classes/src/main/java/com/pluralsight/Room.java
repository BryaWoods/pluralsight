package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = true;
    }

    public void setDirty(boolean dirty) {
        isDirty = true;
    }

    public boolean isAvailable() {
        if (!isOccupied && !isDirty) {
            return true;
        } else {
        return false;
        }
    }
}

