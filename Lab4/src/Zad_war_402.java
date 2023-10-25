public class Zad_war_402 {
    public static void main(String[] args) {
            Library l1 = new Library();
            String arg = "Testowy";
        l1.setCatalog(arg);
        l1.getLength();


    }
}

class Library{
    private String catalog;

    public void setCatalog(String arg){
        catalog=arg;
        System.out.println(catalog);
    }

    public void getLength(){
     int length= catalog.length();
        System.out.println(length);
    }
}
