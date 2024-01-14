package university;
import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        // Porównanie studentów według ocen
        return Float.compare(this.grade, other.grade);
    }

    public static <T extends Comparable<T>> T findMedian(T[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }


        Arrays.sort(array);

        // Znajdź medianę
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Adam", 75.5f),
                new Student("Bartosz", 88.0f),
                new Student("Cezary", 95.2f),
                new Student("Dawid", 82.8f)
        };

        try {

            Student medianStudent = findMedian(students);


            System.out.println("Mediana według ocen: " + medianStudent.getName() + " - " + medianStudent.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
