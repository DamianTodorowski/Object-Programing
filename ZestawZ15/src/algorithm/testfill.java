package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class testfill {
    public static void main(String[] args) {

      Collection<Integer>tab=new ArrayList<Integer>();
      tab.add(2);
        tab.add(2);
        tab.add(2);
        tab.add(2);
        tab.add(2);

        fillwithdefault.fillWithDefaultValue(tab,20);
        System.out.println(tab);
    }
}
