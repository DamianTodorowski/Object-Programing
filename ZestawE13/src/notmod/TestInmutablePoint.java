package notmod;

public class TestInmutablePoint {
    public static void main(String[] args) {
        InmutablePoint p1 = new InmutablePoint(1, 2, 3);
        InmutablePoint p2 = new InmutablePoint(1, 2, 3);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p1.getX(): " + p1.getX());
        System.out.println("p2.getY(): " + p2.getY());
        System.out.println("p1.getZ(): " + p1.getZ());
        System.out.println(p1);
    }
}
