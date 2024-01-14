package Zad14;
import java.util.Arrays;
public class TestMinValue {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5,6,7,8,-9};
        Double[] array2 = {2.2 ,1.2,-19.5};
        String[] array3 = {"ala", "Ma",};

      int minint = MinValue.minvalue(array);
      double mindouble=MinValue.minvalue(array2);
      String minstring=MinValue.minvalue(array3);
        System.out.println(minint);
        System.out.println(mindouble);
        System.out.println(minstring);

    }
}
