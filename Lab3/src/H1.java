public class H1 {
    public static void main(String[] args) {
        String n1="Witam";
        System.out.println(n1);
        System.out.println(reverse(n1));
        String n3=null;
        System.out.println(reverse(n3));
    }

    public static StringBuilder reverse(String arg){
        if(arg==null){
            return null;
        }
        StringBuilder temp = new StringBuilder(arg);
        temp.reverse();
        return temp;
    }
}
