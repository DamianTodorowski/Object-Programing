package library;

public class TitleComparator implements BookComparator<String>{
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
