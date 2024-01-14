package Zad14;

public class MinValue {
    public static <T extends Comparable<T>> T minvalue(T[]array){
         T min = array[0];
        for (int i=1;i<array.length;i++){
            if(array[i].compareTo(min)<0){
                min=array[i];
            }
        }
        return min;
    }
}
