package utilities;

import java.util.List;

public class appendFromEnd {
    static <E> void appendFromend(List<? super E> destination, List<? extends E> source){

        for (int i = source.size()- 1; i >= 0; i--) {
            destination.add(destination.size(), source.get(i));
        }
    }

}
