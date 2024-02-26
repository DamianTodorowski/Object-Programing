package university;

import java.util.Iterator;

public class CountElementsmethod {
    public static <T> int countElements(Iterator<T> items,T element){
        int count = 0;
        while(items.hasNext()){
            T currentItem = items.next();
            if(element.equals(currentItem)){
                count++;
            }
        }
        return count;
    }
}
