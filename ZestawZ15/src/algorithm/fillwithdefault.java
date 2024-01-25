package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class fillwithdefault {
    public static <T> void fillWithDefaultValue(Collection<T> collection, T arg1) {
        if (collection == null) {
            throw new IllegalArgumentException("kolekcja nie może być nullem");
        } else {
            ArrayList<T>pom=new ArrayList<>();
            for (int i = 0; i < collection.size(); i++) {
                pom.add(arg1);
            }
            collection.clear();
            collection.addAll(pom);
        }
    }
}