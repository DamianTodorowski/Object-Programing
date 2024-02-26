package student;

public class TestStudenRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Adam","A2002",4.0);
        StudentRecord s2 = new StudentRecord("Dawid","D2021",3.0);

        System.out.println(s1.printDetails());
        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
