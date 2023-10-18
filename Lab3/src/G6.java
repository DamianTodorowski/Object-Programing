import java.util.ArrayList;

public class G6 {
    public static void main(String[] args) {
        ArrayList<Integer>lt3 = new ArrayList<>();
        lt3.add(3);
        lt3.add(-8);
        lt3.add(7);
        lt3.add(-20);
        lt3.add(40);
        lt3.add(77);
        lt3.add(47);

        System.out.println("Zawartość array list przed zmiana:"+lt3);

        System.out.println("Zawartość array list po zmianie:"+ reverseArray(lt3));
    }

    public static ArrayList<Integer> reverseArray (ArrayList<Integer>arg){

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=arg.size()-1;i>=0;i--){
            temp.add(arg.get(i));
        }
        return temp;
    }
}
