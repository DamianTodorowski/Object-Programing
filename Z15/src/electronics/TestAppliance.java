package electronics;

public class TestAppliance {
    public static void main(String[] args) {
        Appliance fridge = Appliance.createFridge("beko","x2000",220.3);//metoda statyczna

        //metoda nie statyczna
        Appliance appliance = new Appliance("Sony", "Model456", 0.8);
        Appliance anotherAppliance = appliance.createAppliance("LG", "Model789", 1.2);

    }
}
