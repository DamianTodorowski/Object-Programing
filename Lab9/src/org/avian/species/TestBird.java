package org.avian.species;

public class TestBird {
    public static void main(String[] args) {
        Bird b1 = new Bird(null,32.3,true);
        Bird b2 = new Bird("Parrot",41.1,false);
        System.out.println(b1.canMigrate());
        System.out.println(b2);
        System.out.println(b1);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode()==b2.hashCode());
    }
}
