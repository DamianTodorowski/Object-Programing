import java.util.concurrent.ThreadLocalRandom; //biblioteka w której nie trzeba ustawiać zakresu
public class E1 {
    public static void main(String[] args) {
        int int_random = ThreadLocalRandom.current().nextInt(); //inicjalizacja
        System.out.println("Losowy integer: " + int_random); //printowanie



    }
}