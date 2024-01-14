package LinkedList;

import java.util.LinkedList;

public class TestD2 {
    public static void main(String[] args) {
        LinkedList<String>list1=new LinkedList<>(java.util.Arrays.asList("banana", "strawberry","orange"));
        LinkedList<String>list2=new LinkedList<>(java.util.Arrays.asList("apple","kiwi","banana"));
        LinkedList<String>commonElementList = D2.findCommonElements(list1,list2);
        System.out.println("Common Elements:"+commonElementList);
    }
}
