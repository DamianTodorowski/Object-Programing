package pl.com.corporation;

public class Employee {
 private String name;
 private int salary;
 private static int totalEmployeeCount = 0;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        totalEmployeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public static int getTotalEmployeeCount(){
     return totalEmployeeCount;
    }
}
