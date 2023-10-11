import java.util.Scanner;
public class D1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Podaj n:");
        n = scanner.nextInt();
        int wynik=suma_szer(n);
        System.out.println("suma szeregu wynosi:"+wynik);


    }
    public static int suma_szer(int n){
        int suma =0;
        int znak=1;
        for(int i=1;i<=n;i++)
        {
            suma += znak*i;
            znak *= -1;
        }
        return suma;
    }
}