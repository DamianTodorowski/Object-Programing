package athleteTracker;

import java.util.Arrays;

class TestAthlete {
    public static void main(String[] args) {
        Athlete [] athletes = {
                new Athlete("Adam","Running",3.19),
                new Athlete("Max","Formula1",1.39),
                new Athlete("Louis","Formula1",1.25),
                new Athlete("Usain","Running",3.00),
                new Athlete("Fernando","Formula1",1.27)
        };

        System.out.println("Przed sortowaniem:");

            System.out.println(Arrays.toString(athletes));

           Arrays.sort(athletes);
        System.out.println("Po sortowaniu:");
        System.out.println(Arrays.toString(athletes));

    }
}
