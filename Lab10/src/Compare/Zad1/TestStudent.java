package Compare.Zad1;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students={
                new Student("Adam",4.5,2002),
                new Student("Anna",5,2003),
                new Student("Emil",3.5,2000),
                new Student("Marcin",3,2001),
                new Student("Dawid",4,2004)
        };

        System.out.println("Przed sortowaniem");
        for(Student student: students){
            System.out.println(student);
        }
    Arrays.sort(students);
        System.out.println("Po sortowaniu");
        for (Student student : students){
            System.out.println(student);
        }
    }
}
