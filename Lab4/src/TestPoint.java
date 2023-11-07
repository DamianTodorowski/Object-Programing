//Utwórz klasę Point z dwoma polami: x i y reprezentującymi współrzędne na płaszczyźnie.
//Napisz metodę distance(Point otherPoint), która oblicza odległość między bieżącym
//punktem a innym punktem. Stwórz przypadek testowy, aby wywołać metodę co najmniej
//jeden raz.
public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        point1.x=3.0;
        point1.y=4.5;
        point2.x=1.5;
        point2.y=2.0;

        double dist = point1.distance(point2);

        System.out.println("Odległość między punktem 1 a punktem 2 wynosi: " + dist);

    }
}

class Point{
    double x;
    double y;

    public double distance(Point otherPoint){
        double deltaX = this.x-otherPoint.x;
        double deltaY = this.y-otherPoint.y;
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
    }


}
