package education;

import java.util.Objects;

public class School {
    private String name;
    private String adress;
    private int students;

    public School(String name, String adress, int students) {


        this.name = name;
        if (name.isEmpty() || name.equals(" ")) {
            this.name="Wydział Matematyki i Informatyki UWM";
        }
        this.adress = adress;
        if(adress==null || adress.isEmpty()){
            this.adress = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        this.students = students;
        if(students<100){
            this.students = 100;
        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": Name: " + name + ". "+"Adress: "+adress+". "+"Number of students: "+ students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        return Objects.equals(adress, school.adress);
    }

    @Override
    public int hashCode() {
        return adress != null ? adress.hashCode() : 0;
    }

    public int recruitment(int arg){
        students+=arg;
        if(students>500){
            students=500;
        }
        return students;
    }
    public static void checkLimit(School school) {
        int currentNumberOfStudents = school.students;
        int remainingSpace = 500 - currentNumberOfStudents;

        System.out.println("Liczba uczniów w szkole: " + currentNumberOfStudents);
        System.out.println("Pozostała liczba miejsc do pełnego limitu: " + remainingSpace);
    }
}
