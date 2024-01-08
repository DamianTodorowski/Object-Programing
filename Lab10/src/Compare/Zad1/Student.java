package Compare.Zad1;
import java.util.Arrays;
public class Student implements Comparable<Student>{
   private String name;
   private double averageGrade;
   private int YearOfBirth;

   public Student(String name, double averageGrade, int yearOfBirth) {
      this.name = name;
      this.averageGrade = averageGrade;
      YearOfBirth = yearOfBirth;
   }

   public String getName() {
      return name;
   }

   public double getAverageGrade() {
      return averageGrade;
   }

   public int getYearOfBirth() {
      return YearOfBirth;
   }

   @Override
   public int compareTo(Student otherStudent) {
      // Sortowanie malejące według średniej ocen
      return Double.compare(otherStudent.averageGrade, this.averageGrade);
   }


   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", averageGrade=" + averageGrade +
              ", YearOfBirth=" + YearOfBirth +
              '}';
   }
}
