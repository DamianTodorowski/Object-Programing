package Comparatorr.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] samochody = {
                new Samochod("Totota",2019,59000),
                new Samochod("BMW",2020,100000),
                new Samochod("Porsche",2021,350000),
                new Samochod("Mercedes",2016,50000),
                new Samochod("Audi",2023,180000)
        };

        System.out.println("Samochody przed sortowaniem:");
        for(Samochod samochod : samochody){
            System.out.println("Marka: "+samochod.getMarka()+"  Rok produkcji: "+samochod.getRokProdukcji());
        }

        Arrays.sort(samochody, new PorownajAuto()); //odpalanie sorotowania
        System.out.println("Samochody po sortowaniu:");
        for(Samochod samochod : samochody){
            System.out.println("Marka: "+samochod.getMarka()+"  Rok produkcji: "+samochod.getRokProdukcji());
        }
    }
}
