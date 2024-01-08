package Compare.Zad12;

import java.util.Arrays;

public class TestOrder {
    public static void main(String[] args) {
        Order[]orders={
          new Order("Gumy turbo",1000,0.3),
          new Order("Gumy shock",2000,0.3),
                new Order("Pepsi",200,2.5),
                new Order("Coca-Cola",300,3)
        };

        System.out.println("Przed sortowaniem");
        for (Order order : orders){
            System.out.println(order);
        }
        Arrays.sort(orders);
        System.out.println("Po sortowaniu");
        for (Order order : orders){
            System.out.println(order);
        }
    }
}
