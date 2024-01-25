package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Tworki",20222);
       Hospital h2 =(Hospital) h1.clone();
       h1.setName("horoszcz");
        System.out.println(h1.getName());
        System.out.println(h2.getName());


    }
}
