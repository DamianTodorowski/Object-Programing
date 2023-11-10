package com.holiday.akt;

public class TestTrip {
    public static void  main(String[] args){
        Trip t1 = new Trip(213.0);
        System.out.println(t1.getPrice());
        t1.setPrice(50);
        System.out.println(t1.getPrice());
        t1.setPrice(120);
        System.out.println(t1.getPrice());

    }
}
