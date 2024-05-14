package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped("Razor", "Pink",80,5,1,10,1000 );
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        SemiTruck semiTruck = new SemiTruck("Tesla","Purple",150,100,3,3000,2);
        semiTruck.setNumberOfTrailers(2);
        semiTruck.setFuelCapacity(100);

        Hovercraft hoverCraft = new Hovercraft("Hummer","Baby Pink",1000,10,2,300,50);
        hoverCraft.setAirCushionPressure(50);
        hoverCraft.setColor("Blue");

        Car car = new Car("Tesla","White",200,40,5,100,4);
        car.setNumberOfDoors(4);
        car.setTopSpeed(200);

        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());

    }
}
