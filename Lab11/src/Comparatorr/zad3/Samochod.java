package Comparatorr.zad3;
import java.util.Comparator;
public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public double getCena() {
        return cena;
    }
}
