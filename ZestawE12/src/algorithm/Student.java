package algorithm;

import java.util.Objects;

public class Student {
    private String name;
    private float Grade;

    public Student(String name, float grade) {
        this.name = name;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return Grade;
    }

    public void setGrade(float grade) {
        Grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Float.compare(Grade, student.Grade) != 0) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (Grade != 0.0f ? Float.floatToIntBits(Grade) : 0);
        return result;
    }
}
