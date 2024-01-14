package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;

public class ZadA1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("ala");
        list.add("ma");
        list.add("kota");
        list.add("ala");
        list.add("kota");
        printUnique(list);
    }
    public static <T> void printUnique(Collection<T> items){
        HashSet<T> temp= new HashSet<T>(items);
        for(var elem :temp){
            System.out.println(elem);
        }
    }
}
