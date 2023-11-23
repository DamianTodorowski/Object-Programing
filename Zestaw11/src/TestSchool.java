import education.University;
import education.School;


public class TestSchool {
    public static void main(String[] args) {
        School s1 = new School("UWM","",-10);
        School s2 = new School("UMW-WMII","",40);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.recruitment(600));
        School.checkLimit(s2);
        University u1 = new University("UMW","",200,"",0);
        University u2 = new University("UW","",400,"agriculture",0);
        System.out.println(u1);
        System.out.println(u1.recruitment(700));
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode()==u2.hashCode());
    }

}
