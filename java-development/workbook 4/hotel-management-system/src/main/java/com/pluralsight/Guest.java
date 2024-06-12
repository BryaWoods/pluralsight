package com.pluralsight;

public class Guest {
    private String name;
    private int age;
    private boolean isCheckedIn;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
        this.isCheckedIn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public void checkIn() {
        isCheckedIn = true;
    }

    public void checkOut() {
        isCheckedIn = false;
    }


}
