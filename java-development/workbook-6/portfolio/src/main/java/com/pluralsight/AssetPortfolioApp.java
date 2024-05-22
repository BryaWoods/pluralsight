package com.pluralsight;

import com.pluralsight.finance.*;

public class AssetPortfolioApp {
    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio("Brya's Poertfolio","Brya Woods");

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("brya", "666",489);


        account1.deposit(100);

        ((BankAccount)account2).deposit(50);

        FixedAsset house = new House("Malibu Mansion",6000000,2018,10500,4);
        FixedAsset gold = new Gold("Gold Nugget",1000,.5);
        FixedAsset jewelry = new Jewelry("Rolex",30000,24);

        portfolio.add(house);
        portfolio.add(gold);
        portfolio.add(jewelry);
        portfolio.add(account1);

        Valuable mostValuable = portfolio.getMostValuable();
        System.out.println(mostValuable);

        Valuable leastValuable = portfolio.getLeastValuable();
        System.out.println(leastValuable);







    }
}
