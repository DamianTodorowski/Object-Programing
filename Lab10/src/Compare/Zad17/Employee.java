package Compare.Zad17;

public class Employee implements Comparable<Employee>{
    private String FirstName;
    private String LastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        FirstName = firstName;
        LastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Employee otherEmployee){
        return Integer.compare(this.LastName.length(),otherEmployee.LastName.length());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
