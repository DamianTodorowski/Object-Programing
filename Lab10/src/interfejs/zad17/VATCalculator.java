package interfejs.zad17;

public interface VATCalculator {
    double vatRate = 0.23;

    static double calculateWithVAT(double price) {

        double totalPrice = price * (1 + vatRate);
        return totalPrice;
    }
}