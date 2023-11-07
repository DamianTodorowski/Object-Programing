public class TestCar2 {
    public static void main(String[] args) {
        Car2 c1 = null;
        if (c1 != null)//w tym przypadku to zawsze będzie fałsz
        {
            System.out.println(c1.brand);
        }
        else{
            System.out.println("Car is null");
        }

    }
}

class Car2{
    public String brand;
}