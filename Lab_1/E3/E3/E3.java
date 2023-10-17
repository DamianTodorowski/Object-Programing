import java.util.Random;

public class E3 {
    public static void main(String[] args) {
        int min = 1;
        int max = 67;
        Random random = new Random();

        // Wygenerowanie losowej liczby całkowitej w zakresie od min do max
        int randomNum = random.nextInt((max - min) + 1) + min;
        

        System.out.println("Losowa liczba całkowita: " + randomNum);

    }
}
