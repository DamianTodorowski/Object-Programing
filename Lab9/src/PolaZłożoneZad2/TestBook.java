package PolaZłożoneZad2;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("W pustyni i w puszczy","Henryk sienkiewicz");
        b1.AddReview(3.5);
        b1.AddReview(3.4);
        b1.AddReview(5.0);
        b1.AddReview(4.2);
        System.out.println(b1);
        b1.removeReview(0);
        System.out.println(b1);
        FantasyBook f1 = new FantasyBook("Wiedźmin: Krew Elfów","Andrzej Sapkowski", new ArrayList<>(),"Średniowieczne");
        f1.AddReview(5.0);
        f1.AddReview(4.7);
        f1.AddReview(3.1);
        System.out.println(f1);
        System.out.println(f1.equals(b1));
        System.out.println(f1.hashCode()==b1.hashCode());
        f1.setArtist("andrzej sapkowski");
        System.out.println(f1.getArtist());



    }
}
