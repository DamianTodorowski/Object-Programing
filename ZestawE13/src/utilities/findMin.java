package utilities;

public class findMin {
    public static <T extends Comparable<T>> T findMin(T o1, T o2, T o3){
        T min = o1;
        if(o2.compareTo(min)<0){
            min=o2;
        }
        if(o3.compareTo(min)<0){
            min=o3;
        }
        return min;
    }
}
