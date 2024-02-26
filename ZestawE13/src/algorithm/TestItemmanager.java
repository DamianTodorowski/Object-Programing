package algorithm;

public class TestItemmanager {
    public static void main(String[] args) {
        ItemManager<String>i1=new ItemManager<>();
        String s1= "ala";
        String s2 = "mama";
        i1.addItem(s1);
        i1.addItem(s2);
        System.out.println(i1.getItem(1));
        System.out.println(i1.getItemCount());



    }

}
