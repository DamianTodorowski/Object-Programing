package utilities;

public class GenericCountLessThanOrEqual {
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[]tab,T object){
        int count =0;
        for (int i =0;i<tab.length;i++){
            if(tab[i].compareTo(object)<=0){
                count++;
            }
        }
        return count;

    }
}
