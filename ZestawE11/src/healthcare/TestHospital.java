package healthcare;

 class TestHospital {
    public static void main(String[] args) {
        Clinic c1 = new Clinic("Tworki",500.2,0.0);
        Hospital h1 = new Hospital("Szpital MSWiA",10000);
        Clinic c2 = new Clinic("Tworki",500.2,0.0);
        Hospital h2 = new Hospital("Szpital MSWiA",10000);
        Clinic c3 = new Clinic("horoszcz",40000,5.0);


        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(h1.equals(h2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(h1));

    }
}
