package net.company.zad9;

 class Employee {
    private String firstName;
    private String lastName;
    private int Salary;

    {
        this.Salary=3000;
    }


    public Employee(String firstName, String lastName,int Salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }
}
