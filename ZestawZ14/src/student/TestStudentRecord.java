package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Marcin", "2132",4.0);
        StudentRecord s2 = new StudentRecord("Damian","2137",3.0);

        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
