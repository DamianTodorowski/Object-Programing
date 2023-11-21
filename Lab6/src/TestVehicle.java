import pl.edu.uwm.zad2.Vehicle;
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Audi","RS6",2022);
        System.out.println(v1);
        Vehicle v2 = new Vehicle("Audi","RS6",2022);
        System.out.println(v2);
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode() == v2.hashCode());
    }
}
