package testing;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Bugatti chiron",350);
        Vehicle v2= new Vehicle("Bugatti Veyron", 300);
        Vehicle v3 = new Vehicle("Bugatti chiron",350);

        CompareandPrint.compareAndPrint(v1,v2);
        CompareandPrint.compareAndPrint(v1,v3);
    }
}
