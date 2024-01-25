package printing;

import java.util.List;

public class TestUtilities {
    public static void main(String[] args) {
       List<String>list1= List.of("Witam ","oby ","zdaneXD");
       List<Integer>list2=List.of(1,2,3,5,2,5,2);

       Utilities.printEverySecond(list1);
       Utilities.printEverySecond(list2);

    }


}
