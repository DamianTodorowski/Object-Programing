package printing;

import java.util.ArrayList;
import java.util.Collection;

public class Utilities {
    public static <E> void printEverySecond (Collection<E>collection){
        //kolekcja nie ma iteracji
        ArrayList<E>pom=new ArrayList<>(collection);
        for (int i = 1;i<collection.size();i=i+2){
            System.out.println(pom.get(i));
        }
    }
}
