package PolaZłożoneZad2;

import java.util.ArrayList;
import java.util.Objects;

 class Book {
    private String title;
    private String artist;
    private ArrayList<Double>reviews;

    public Book(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Double> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Double> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!Objects.equals(title, book.title)) return false;
        if (!Objects.equals(artist, book.artist)) return false;
        return Objects.equals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }

    public void AddReview(double review){
        reviews.add(review);
    }
    public void removeReview(int index) {

        if (index >= 0 && index < reviews.size()) {
            reviews.remove(index);
        } else {
            System.out.println("Podany indeks jest nieprawidłowy.");
        }
    }
}
