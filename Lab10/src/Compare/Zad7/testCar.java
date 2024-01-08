package Compare.Zad7;

import java.util.Arrays;

public class testCar {
    public static void main(String[] args) {
        Car[] cars={
                new Car("Toyota",210000,2004),
                new Car("BMW",83000,2023),
                new Car("Audi",94000,2024),
                new Car("MercedesBenz",50000,2024)
        };

        System.out.println("Przed sortowaniem:");
        for(Car car :cars){
            System.out.println(car);
        }

        System.out.println("Po sortowaniu");
        Arrays.sort(cars);
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
