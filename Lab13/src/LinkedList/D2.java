package LinkedList;
import java.util.LinkedList;

public class D2 {
    public static <T> LinkedList<T> findCommonElements(LinkedList<T>list1,LinkedList<T>list2){
        LinkedList<T> commonElementList=new LinkedList<>();
        for(T element1 :list1){
            for (T element2 :list2){
                if(element1.equals(element2)&& !commonElementList.contains(element1)){
                    commonElementList.add(element1);
                    break;
                }
            }
        }
        return  commonElementList;
    }
}