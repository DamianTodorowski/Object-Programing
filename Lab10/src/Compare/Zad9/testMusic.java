package Compare.Zad9;

import java.util.Arrays;

public class testMusic {
    public static void main(String[] args) {
        Music[]albums={
                new Music("MUS!C","Playboy Carti",2024),
                new Music("All eyez on me","2pac",1996),
                new Music("Utopia","Travis Scott",2023),
                new Music("Mr. Morale & the Big Steppers","Kendrick Lamar",2022),
                new Music("Meet the Woo 2", "Pop Smoke",2020),
                new Music("Donda","Kanye West",2021),



        };

        System.out.println("Przed sortowaniem");
        for(Music music : albums){
            System.out.println(music);
        }
        System.out.println("Po sortowaniu");
        Arrays.sort(albums);
        for(Music music: albums){
            System.out.println(music);
        }
    }
}
