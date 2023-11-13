package com.people.zad1;

class Person {

    private static int counter=0;
    private String name;

    public Person(){

        counter++;
    }

    public static int getCounter() {

        return counter;
    }
}