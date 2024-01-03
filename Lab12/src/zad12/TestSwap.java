package zad12;
import java.util.Arrays;
public class TestSwap {
    public static void main(String[] args) {
        Integer[] tab = {3,-4,9,10,34};
        Swap.swap(tab, 2,3);
        System.out.println(Arrays.toString(tab));
        String[] words = {"AA", "TT", "HH", "jjhfherhf"};
        Swap.swap(words, 0,3);
        System.out.println(Arrays.toString(words));
    }

}
