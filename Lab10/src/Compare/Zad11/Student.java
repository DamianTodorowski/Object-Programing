package Compare.Zad11;

public class Student implements Comparable<Student>{
    private String name;
    private  double averageGrade;
    private int YearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        YearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfStudy() {
        return YearOfStudy;
    }
    @Override
    public int compareTo(Student otherStudent){
        if(this.averageGrade==otherStudent.averageGrade){
            return Integer.compare(this.YearOfStudy,otherStudent.YearOfStudy);
        }
        return Double.compare(otherStudent.averageGrade,this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", YearOfStudy=" + YearOfStudy +
                '}';
    }
}
