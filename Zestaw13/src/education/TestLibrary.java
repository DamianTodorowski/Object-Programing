package education;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        List<Library> libraryList = new ArrayList<>();

        Library l1 = new Library("Biblioteka im. Joachima Lelewela", "Pułtusk", 550);
        Library l2 = new Library("", "", 300);
        SchoolLibrary s1 = new SchoolLibrary("Biblioteka szkolna", "Maków Mazowiecki", 400, "Podstawowa", 3);
        SchoolLibrary s2 = new SchoolLibrary("", "", 0, "", 2);
        Library l3 = new Library("Biblioteka Gminna", "Karniewo", 322);

        // Adding libraries to the list
        libraryList.add(l1);
        libraryList.add(l2);
        libraryList.add(s1);
        libraryList.add(s2);
        libraryList.add(l3);

        // Iterating through the list
        for (Library library : libraryList) {
            // Calling the overridden toString method
            System.out.println(library.toString());

            // Checking if the library is a SchoolLibrary and calling addBooks if true
            if (library instanceof SchoolLibrary) {
                ((SchoolLibrary) library).addBooks(4);
            }
        }
    }
}
