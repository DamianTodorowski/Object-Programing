package pl.edu.uwm.restaurant;

public class MenuItem {
    private String name;
    private String ingredients;
    private double price;

    public MenuItem(String name, String ingredients, double price)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Pozycja Menu. Nazwa: "+name+", "+"składniki: "+ingredients+", "+"cena: "+price+" zł.";
    }
}
