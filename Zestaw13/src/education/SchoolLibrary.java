package education;

import java.util.Objects;

 class SchoolLibrary extends Library {
    private String schoolType;
    private int librarians;

    public SchoolLibrary(String name, String location, int books, String schoolType, int librarians) {
        super(name, location, books);
        this.schoolType=schoolType;
        if(schoolType==null || schoolType.isEmpty()){
            this.schoolType="średnia";

        }
        this.librarians=librarians;
        if(librarians<=2){
            this.librarians=3;

        }


    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
       if(schoolType!=null && !schoolType.isEmpty()){
           this.schoolType = schoolType;
       }
    }

    public int getLibrarians() {
        return librarians;
    }

    public void setLibrarians(int librarians) {
        if(librarians>2){
            this.librarians = librarians;
        }
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + super.toString()+"\n"+
                "School Type: "+ schoolType+". Number of librarians: "+librarians+".";

    }

    @Override
    public int addBooks(int value) {
        int booksAdded=getBooks()+value;
        if(booksAdded>3000){
            booksAdded=3000;
        }
        return booksAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SchoolLibrary that = (SchoolLibrary) o;

        return Objects.equals(schoolType, that.schoolType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (schoolType != null ? schoolType.hashCode() : 0);
        return result;
    }
}
