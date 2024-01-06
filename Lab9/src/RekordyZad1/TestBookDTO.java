package RekordyZad1;

public class TestBookDTO {
    public static void main(String[] args) {

        BookDTO b1 = new BookDTO("Chłopi", "Reymont", 39.99,2012);
        System.out.println(b1);
        BookDTO b2 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz",38.99,2011);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode()==b2.hashCode());
        System.out.println(b1.price());
    }
}
