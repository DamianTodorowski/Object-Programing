package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("","",300);
        Hospital h2 =new Hospital("","",300);
        Hospital h3 = new Hospital("Szpital Psychiatryczny", "Tworki",700);
        Hospital h4 = new Hospital("", "Mickiewicza 12, 13-370 Bulkowo",400);
        Hospital h5 = new Hospital("Szpital MSWIA","Warszawa Mokotów",999);
        System.out.println(h1.equals(h2));
        System.out.println(h2.equals(h3));
        System.out.println(h3.equals(h4));
        System.out.println(h4.equals(h5));
        System.out.println(h5.equals(h1));
        Clinic c1 = new Clinic("","",300,"",0);
        Clinic c2 = new Clinic("","",300,"",0);
        Clinic c3 = new Clinic("Szpital Psychiatryczny", "Tworki",700,"Psychiatria",30);
        Clinic c4 = new Clinic("", "Mickiewicza 12, 13-370 Bulkowo",400,"",50);
        Clinic c5 = new Clinic("Szpital MSWIA","Warszawa Mokotów",999,"kardiologia",66);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println(c4.equals(c5));
        System.out.println(c5.equals(c1));
    }
}
