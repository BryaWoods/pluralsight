package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Miami Beach Penthouse","2022-08-03",30000000,"300 Biscayne Blvd, Miami, FL 33130",
                1,12302,15000));
        assets.add(new House("Malibu Mansion","2024-05-14",60000000,"911 Juarez Ave, Malibu, CA 92262",
                1,80000,15000));

        assets.add(new Vehicle("Brya's Car", "2020-10-13",65000,"Tesla Model Y",
                2020,88000));
        assets.add(new Vehicle("Brya's other car","2022-08-03",25000,"Honda S2000",
                2001,120000));

        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getValue());

            if (asset instanceof House){
                House house = (House) asset;
                System.out.println(house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println(vehicle.getMakeModel() + vehicle.getYear());
            }

        }


    }
}
