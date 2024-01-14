package ArrayList;

import java.util.ArrayList;

public class ZadC1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        ArrayList<Integer>mergedList=mergeLists(list1,list2);

        System.out.println("List1:"+list1);
        System.out.println("List2:"+list2);
        System.out.println("Merged List1 and List2:"+mergedList);
    }
    public static <T> ArrayList<T>mergeLists(ArrayList<T>list1,ArrayList<T>list2){
        ArrayList<T>Merged=new ArrayList<>(list1.size()+list2.size());
        Merged.addAll(list1);
        Merged.addAll(list2);
        return Merged;
    }
}
