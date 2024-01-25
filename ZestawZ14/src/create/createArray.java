package create;

import java.util.Arrays;

public class createArray {

    public static <T> void CreateArray(T a, T b, T[]array) {
        if (array.length == 2) {

            array[0] = a;
            array[1] = b;

        }
        else {
            throw new IllegalArgumentException("Zły rozmiar tablicy");
        }

    }


    public static void main(String[] args) {
        Integer[] tab1 = new Integer[2];
        String[] tab2 = new String[2];
        createArray.CreateArray(1, 3, tab1);
        createArray.CreateArray("witam", "serdecznie", tab2);

        System.out.println(Arrays.asList(tab1));
        System.out.println(Arrays.asList(tab2));
    }


    }

