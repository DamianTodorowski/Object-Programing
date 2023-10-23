public class H20 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("To jest przykładowy napis do przycięcia.");
        int n = 20; // Docelowa długość napisu

        System.out.println("Przed przycięciem: " + sb);
        trimToSize(sb, n);
        System.out.println("Po przycięciu: " + sb);
    }


    public static void trimToSize(StringBuffer sb, int n) {
        if (sb.length() > n) {
            sb.setLength(n);
        }
    }
}