import java.util.ArrayList;


public class  G8 {
    public static void main(String[] args) {

        ArrayList<Integer> lt1 = new ArrayList<>();
        lt1.add(0);
        lt1.add(-8);
        lt1.add(0);
        lt1.add(-20);
        lt1.add(40);
        lt1.add(0);

        System.out.println("Zawartość array list:" + lt1);
        System.out.println("Ilość Zer:" + countZeros(lt1));
    }

    public static int countZeros(ArrayList<Integer> arg) {
        int count =0;
        for (Integer integer : arg) {
            if (integer == 0) {
                count++;
            }
        }
        return count;
    }
}