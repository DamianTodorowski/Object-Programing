package interfejs.zad17;

public class VATTest {
    public static void main(String[] args) {

        double productPrice = 115.0;


        double totalPriceWithVAT = VATCalculator.calculateWithVAT(productPrice);


        System.out.println("Cena produktu bez VAT: " + productPrice);
        System.out.println("Cena produktu z doliczonym VAT (" + (VATCalculator.vatRate * 100) + "%): " + totalPriceWithVAT);
    }
}
