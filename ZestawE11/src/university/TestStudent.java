package university;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Adam",5),
                new Student("Marcin",4.5),
                new Student("Adam",5),
                new Student("Damian",4)
        );
            Student example = new Student("Adam",5);
        int couner = CountElementsmethod.countElements(students.iterator(),example);
        //żeby działało dodaj equals do klasy student
        System.out.println(couner);
    }
}
