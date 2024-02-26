package university;

public record Student(String name, double averageGrade, int yearOfStudy)implements Comparable<Student>{

    @Override
    public String name() {
        return name;
    }

    @Override
    public double averageGrade() {
        return averageGrade;
    }

    @Override
    public int yearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public int compareTo(Student other) {
        int avgGrade = Double.compare(other.averageGrade,this.averageGrade);
        if(avgGrade!=0){
            return avgGrade;
        }
        return Integer.compare(this.yearOfStudy,other.yearOfStudy);
    }
}
