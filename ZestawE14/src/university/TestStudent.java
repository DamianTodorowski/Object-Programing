package university;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Adrian", 4.5, 2),
                new Student("Damian", 4.0, 1),
                new Student("Alicja", 4.0, 3),
                new Student("Dawid", 4.0, 4)
        };

        System.out.println("Before:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("After:");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);

        }
    }
}
