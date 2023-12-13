package interfejs.zad14;

public class DrawableTester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();


        System.out.println("Circle:");
        circle.draw();
        circle.display();

        System.out.println("\nRectangle:");
        rectangle.draw();
        rectangle.display();


        System.out.println("\nStatic Type:");
        System.out.println(Drawable.getType());
    }
}
