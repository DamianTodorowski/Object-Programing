package moto;

class Maxvalue {

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array == null || array.length==0){
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }
        T max = array[0];
        for (int i =1;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }


}
