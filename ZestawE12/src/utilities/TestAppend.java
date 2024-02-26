package utilities;

import java.util.ArrayList;

public class TestAppend {
    public static void main(String[] args) {
        ArrayList<String>source=new ArrayList<>();
        source.add("One");
        source.add("Two");
        source.add("Three");
        ArrayList<String>destination=new ArrayList<>();

        System.out.println("Before Appending");
        System.out.println(source);
        GenericAppend.appendFromEnd(destination,source);
        System.out.println("After Appending");
        System.out.println(destination);

    }
}
