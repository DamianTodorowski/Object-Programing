package RekordyZad6;

 record Car(String brand, String model, double fuelConsumptionPer100km) {
    double fuelcost(double fuelPrice, double distance){

        double fuelConsumed = (distance / 100) * fuelConsumptionPer100km;


        double cost = fuelConsumed * fuelPrice;

        return cost;
    }
}


