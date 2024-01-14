package healthcare;

public class TestHospital {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hospital h1 = new Hospital("Szpital MSWiA",10000);

        Hospital h1Copied = (Hospital) h1.clone();

        h1.setName("Horoszcz");

        System.out.println("H1 oryginał:"+h1);

        System.out.println("H1 skopiowane:"+h1Copied);

    }
}
