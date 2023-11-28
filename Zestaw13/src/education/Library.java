package education;

import java.util.Objects;

 class Library {
    private String name;
    private String location;
    private int books;

    public Library(String name, String location, int books) {
        this.name = name;
        if(name==null||name.isEmpty()){
            this.name="Biblioteka Miejska";
        }
        this.location = location;
        if(location==null||location.isEmpty()){
            this.location="ul. Wiedzy 123, 00-001 Miasteczko";
        }
        this.books = books;
        if(books<=0){
            this.books=100;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty()) {
            this.location = location;
        }
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        if (books > 0) {
            this.books = books;
        }
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "Name: "+name+". Location: "+location+". Number of books:"+books+"." ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        return Objects.equals(location, library.location);
    }

    @Override
    public int hashCode() {
        return location != null ? location.hashCode() : 0;
    }

    public int addBooks(int value){
        int booksAdded=books+value;
        if(booksAdded>5000){
            booksAdded=5000;
        }
        return booksAdded;
    }
    static void checkBookCapacity(Library library){
        System.out.println("Obecnie książek jest: "+library.books);
        int booksleft=5000-library.books;
        System.out.println("Do limitu zostało"+booksleft+"książek");
    }
}
