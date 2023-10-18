import java.util.ArrayList;


public class G3 {
    public static void main(String[] args) {

        ArrayList<Integer>lt1 = new ArrayList<>();
        lt1.add(3);
        lt1.add(-8);
        lt1.add(7);
        lt1.add(-20);
        lt1.add(40);
        lt1.add(-99);

        System.out.println("Zawartość array list:"+lt1);
        System.out.println("Najmniejsza wartosc:"+minimumvalue(lt1));
    }

    public static int minimumvalue (ArrayList<Integer>arg){
        int min=0;
        for(int i=0;i<arg.size();i++)
            if(arg.get(i)<min){
                min=arg.get(i);
            }
        return min;
    }
}
