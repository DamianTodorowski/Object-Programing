package pl.edu.uwm.books;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Book of five rings");
        Book b2 = new Book(null);
        Book b3 = new Book(new String("Book of five rings"));

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b3.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
    }



}
