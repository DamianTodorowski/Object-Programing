public class H2 {
    public static void main(String[] args) {
        String n1="kamil ślimak";
        System.out.println(isPanindrome(n1));

    }

    public static boolean isPanindrome(String arg) {

        String temp = new String();
        for (int i = arg.length() - 1; i >= 0; i--) {
            char ch = arg.charAt(i);
            temp = ch + temp;

        }
        return arg.equals(temp);
    }
}
