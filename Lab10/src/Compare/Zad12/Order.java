package Compare.Zad12;

public class Order implements Comparable <Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int compareTo(Order otherOrder){
        if(this.unitPrice==otherOrder.unitPrice){
            return Integer.compare(this.quantity,otherOrder.quantity);
        }
        return Double.compare(otherOrder.unitPrice,this.unitPrice);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
