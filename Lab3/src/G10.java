import java.util.ArrayList;
public class G10 {
    public static void main(String[] args) {
        ArrayList<Integer>lt4 = new ArrayList<>();
        lt4.add(1);
        lt4.add(2);
        lt4.add(3);
        lt4.add(4);
        lt4.add(5);

        System.out.println("Oryginalny ArrayList:"+lt4);
        ArrayList<Integer>copiedlist = copyArray(lt4);
        System.out.println("Skopiowany ArrayList"+copiedlist);

    }


    public static ArrayList<Integer> copyArray (ArrayList<Integer>arg){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<arg.size();i++){
            temp.add(arg.get(i));
        }
        return temp;
    }
}
