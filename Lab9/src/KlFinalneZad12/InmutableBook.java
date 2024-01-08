package KlFinalneZad12;

import java.util.Objects;

public class InmutableBook {
    private final String title;
    private final String author;
    private final int ISBN;

    public InmutableBook(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "ImmutableBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InmutableBook that = (InmutableBook) o;

        if (ISBN != that.ISBN) return false;
        if (!Objects.equals(title, that.title)) return false;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + ISBN;
        return result;
    }
}

//klasa musi być statyczna aby została uznana jako niemodyfikowalna(inmutable)
//jeżeli byłoby "public final class InmutableBook" to byłoby ok
