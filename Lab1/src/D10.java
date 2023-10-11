import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("podaj n:");
        n = scanner.nextInt();
        System.out.println("wynik: "+jedynki(n));
    }

    public static int jedynki(int n){
        if(n%10==1){
            return 1;
        }
        return 0;
    }
}
