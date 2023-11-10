package pl.cars.zad12;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private int mileage;
    private String color;
 public Car(String brand, String model, int productionYear, int mileage ,String color){
  this.brand = brand;
  this.model = model;
  this.productionYear = productionYear;
  this.mileage= mileage;
  this.color=color;
 }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getMileage() {
        return mileage;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void displayInformation(){
        System.out.println(this.brand +"\n" + this.model+"\n"+ this.productionYear+ "\n"+ this.mileage
                +"\n"+ this.color);
    }
}
