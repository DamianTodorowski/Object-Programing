package zad12;

public class Swap {

    public static<T> void swap( T[] array, int index1, int index2){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie może byc pusta");
        }
        if(index1<0 || index1>= array.length || index2<0 || index2>= array.length){
            throw new IllegalArgumentException("Błędny indeks");
        }
            T temp = array[index1];
        array[index1]=array[index2];
        array[index2]= temp;
    }
}
