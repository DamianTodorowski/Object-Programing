package pl.com.corporation;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 50000);
        Employee employee2 = new Employee("Jane", 60000);
        Employee employee3 = new Employee("Bob", 55000);
        Employee employee4 = new Employee("Alice", 70000);
        Employee employee5 = new Employee("Tom", 48000);
        Employee employee6 = new Employee("Adam", 9999);

   
        System.out.println("Liczba pracowników: " + Employee.getTotalEmployeeCount());
    }
}