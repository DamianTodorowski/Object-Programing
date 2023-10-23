import java.util.ArrayList;


public class  G4 {
    public static void main(String[] args) {

        ArrayList<Double>lt1 = new ArrayList<>();
        lt1.add(3.5);
        lt1.add(-8.1);
        lt1.add(7.4);
        lt1.add(-20.7);
        lt1.add(40.3);
        lt1.add(-99.9);

        System.out.println("Zawartość array list:"+lt1);
        System.out.println("Najmniejsza wartosc:"+minimumvalue(lt1));
    }

    public static Double minimumvalue (ArrayList<Double>arg){
        Double min=0.0;
        for(int i=0;i<arg.size();i++)
            if(arg.get(i)<min){
                min=arg.get(i);
            }
        return min;
    }
}
