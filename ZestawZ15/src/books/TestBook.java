package books;

import java.util.ArrayList;
import java.util.Collections;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",1911);
        Book b2 = new Book("Pan Tadeusz","Adam Mickiewicz", 1800);
        Book b3 = new Book("Nic mnie nie złamie", "David Goggins", 2018);
        Book b4 = new Book("Ferdydurke ","Witold Gombrowicz", 1937);
        ArrayList<Book>booktab=new ArrayList<>();
        booktab.add(b1);
        booktab.add(b2);
        booktab.add(b3);
        booktab.add(b4);

        Collections.sort(booktab);

        System.out.println(booktab);

    }
}
