package Compare.Zad7;

public class Car implements Comparable<Car>{
    private String brand;
    private int mileage;
    private int YearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        this.brand = brand;
        this.mileage = mileage;
        YearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }
    @Override
    public int compareTo(Car otherCar){
        return Integer.compare(this.mileage,otherCar.mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", YearOfProduction=" + YearOfProduction +
                '}';
    }
}
