package PolaZłożoneZad2;

import java.util.ArrayList;
import java.util.Objects;

 class FantasyBook extends Book{

    private String fantasySubgenre;
    public FantasyBook(String title, String artist, ArrayList<Double>reviews,String fantasySubgenre) {
        super(title, artist);
        this.fantasySubgenre = fantasySubgenre;

    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return  super.toString()+"FantasyBook{" +
                "fantasySubgenre='" + fantasySubgenre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FantasyBook that = (FantasyBook) o;

        return Objects.equals(fantasySubgenre, that.fantasySubgenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fantasySubgenre != null ? fantasySubgenre.hashCode() : 0);
        return result;
    }
}
