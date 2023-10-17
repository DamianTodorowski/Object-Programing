public class F10 {
    public static boolean czyKwadrat(int liczba) {
        int pierwiastek = (int) Math.sqrt(liczba);
        return pierwiastek * pierwiastek == liczba;
    }

    public static void main(String[] args) {
        int[] tablica = new int[30];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1; //wypełnianie tablicy
        }

        int iloscKwadratow = 0;


        for (int liczba : tablica) {
            if (czyKwadrat(liczba)) {
                iloscKwadratow++;
            }
        }

        System.out.println("Tablica liczb całkowitych:");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

        System.out.println("\nIlość liczb będących kwadratami innych liczb całkowitych: " + iloscKwadratow);
    }
}
