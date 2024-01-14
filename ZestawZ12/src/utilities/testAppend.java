package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class testAppend {
    public static void main(String[] args) {
        List<Object>Destination=new ArrayList<>();
        List<Integer>Source=new ArrayList<>();
        Source.add(1);
        Source.add(2);
        Source.add(3);
        Source.add(4);

        appendFromEnd.appendFromend(Destination,Source);

        for (Object element : Destination){
            System.out.println(element);
        }
    }
}
