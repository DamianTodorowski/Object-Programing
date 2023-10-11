public class F1 {
    public static void main(String[] args) {
        int tab1[]={3,2,-10,54,-8,2,12,89,3,-21};
        for(int i =tab1.length-1;i>=0;i--)
        {
            System.out.println(tab1[i]);
        }
        int tab2[]=new int[10];
        Random random = new Random();
        random =setSeed(345);
        for(int i =tab2.length;i>=0;i--)
        {
            System.out.println(tab2[i]);
        }
    }
}
