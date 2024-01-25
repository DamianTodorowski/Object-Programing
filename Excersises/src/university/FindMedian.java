package university;

public class FindMedian {
    public static <T extends Comparable<T>> void findMedian(T[]tab){
        int median = tab.length /2;

        T indeks=tab[median];
        System.out.println("Mediana wynosi:"+indeks);
    }
}
