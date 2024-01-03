package library;

public class AuthorComparator implements BookComparator<String>{
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }

}
