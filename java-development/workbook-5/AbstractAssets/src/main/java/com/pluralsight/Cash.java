package com.pluralsight;

public class Cash extends Asset{

    private String currency;
    private double amount;

    public Cash(String description, String dateAcquired, double originalCost, String currency, double amount) {
        super(description, dateAcquired, originalCost);
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getValue() {
        return amount;
    }
}
