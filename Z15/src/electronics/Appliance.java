package electronics;

 class Appliance {
    private String brand;
    private String model;
    private double powerUsage;

    public Appliance(String brand, String model, double powerUsage) {
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public static Appliance createFridge(String brand, String model, double powerUsage){
        return new Appliance(brand,model,powerUsage);
    }

    public Appliance createAppliance(String brand,String model,double powerUsage){
        return new  Appliance(brand,model,powerUsage);
    }
}
