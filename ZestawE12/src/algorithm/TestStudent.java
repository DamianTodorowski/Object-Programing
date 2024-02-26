package algorithm;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Adam",4.5f);
        Student s2 = new Student("Adam",5f);
        Student s3 = new Student("Adam",4.5f);
        Student s4 = new Student("Adam",4.5f);


        System.out.println(compare3.compareThree(s1,s2,s3));
        System.out.println(compare3.compareThree(s1,s3,s4));


    }
}
