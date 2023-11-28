package moto;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle newCar = Vehicle.createCar("Toyota", "Supra",2022);
        Vehicle v1 = new Vehicle("bmw","m3",2020);
        Vehicle v2 = v1.createVehicle("audi","a6",2019);


    }
}
