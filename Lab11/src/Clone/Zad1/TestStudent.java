package Clone.Zad1;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Adam",21,5.0);
        Student sClone = (Student) s1.clone();
        s1.setGrade(4.5);

        System.out.println(s1.getGrade());
        System.out.println(sClone.getGrade());
    }
}
