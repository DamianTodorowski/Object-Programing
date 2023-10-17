public class F17 {
    public static int licz_zera(int[] array) {
        int zeroCounter = 0;

        for (int num : array) {
            if (num == 0) {
                zeroCounter++;
            }
        }

        return zeroCounter;
    }
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int zera = licz_zera(array);

        System.out.println("Liczba zer w tablicy: " + zera);
    }


}
