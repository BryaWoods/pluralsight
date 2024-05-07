package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Employee Test

        Employee emp1 = new Employee("28550", "Brya","Front Desk", 65, 30);

        emp1.setHoursWorked(35);
        System.out.println("Regular Hours Worked: " + emp1.getRegularHours());
        System.out.println("Overtime Hours Worked: " + emp1.getOvertimeHours());

        emp1.setHoursWorked(40);
        System.out.println("Regular Hours Worked: " + emp1.getRegularHours());
        System.out.println("Overtime Hours Worked: " + emp1.getOvertimeHours());

        emp1.setHoursWorked(45);
        System.out.println("Regular Hours Worked: " + emp1.getRegularHours());
        System.out.println("Overtime Hours Worked: " + emp1.getOvertimeHours());

       //Reservation Test

        Reservation reservation1 = new Reservation("Double", 100, 3, false);


        System.out.println("Total cost for reservation 1: $" + reservation1.getReservationTotal());


        reservation1.setRoomType("King");
        reservation1.setWeekend(true);
        reservation1.setNumberOfNights(2);
        reservation1.setWeekend(false);
        reservation1.setNumberOfNights(3);
        System.out.print("Total cost for updated reservation 1: $");
        System.out.printf("%.2f\n",reservation1.getReservationTotal());


        Reservation reservation2 = new Reservation("King", 150, 2, true);

        System.out.print("Total cost for reservation 2: $");
        System.out.printf("%.2f",reservation2.getReservationTotal());
    }


}

