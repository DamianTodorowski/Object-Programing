import java.util.Arrays;

public class F24{
    public static int[] sortuj(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length); // Kopiowanie tablicy, aby nie zmieniać oryginału
        Arrays.sort(sortedArray);
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};
        int[] sortedArr = sortuj(array);

        System.out.println("Tablica oryginalna: " + Arrays.toString(array));
        System.out.println("Tablica posortowana: " + Arrays.toString(sortedArr));
    }


}
