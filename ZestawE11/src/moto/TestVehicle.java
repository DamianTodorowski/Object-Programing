package moto;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[]vehicles={
                new Vehicle("Audi a3",195),
                new Vehicle("Mercedes A45 AMG",290),
                new Vehicle("Toyota yaris",185),
                new Vehicle("BMW M4 CS",330),
                new Vehicle("Rimac Nevera",560)
        };
        Vehicle maxvehicle= Maxvalue.maxValue(vehicles);
        System.out.println(maxvehicle);
    }
}
