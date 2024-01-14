package Clone.Zad1;

public class Student implements Cloneable{
    private String name;
    private int age;
    private double Grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Grade=" + Grade +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }
}
