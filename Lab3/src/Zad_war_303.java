import java.util.Scanner;
public class Zad_war_303 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("podaj n:");
        n = scanner.nextInt();
        System.out.println("podwojona liczba:"+podwoj(n));
    }
    public static int podwoj(int n){
        return 2*n;
    }
}
