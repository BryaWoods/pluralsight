package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = 
    }
    public void add(Valuable valuable){
        valuables.add(valuable);
    }

    public double getValue(){
        double value = 0;
        for (Valuable valuable : valuables){
            value += valuable.getValue();
        }
        return value;
    }

    public Valuable getMostValuable() {

        if(valuables.isEmpty()){
            return null;
        }

        Valuable mostValuable = valuables.get(0);

        for (Valuable valuable : valuables) {
            if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable() {

        if(valuables.isEmpty()){
            return null;
        }

        Valuable leastValuable = valuables.get(0);

        for (Valuable valuable : valuables) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }

        return leastValuable;
    }

}
