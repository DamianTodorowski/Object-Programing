package Compare.Zad17;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[]employees={
                new Employee("Bastian","Obsztyfikultykiewicz","CEO"),
                new Employee("Damian","Todorowski","Project Manager"),
                new Employee("Kacper","Damięcki","CyberSec Manager"),
                new Employee("Marcin","Gorczyński","DevOpts")
        };

        System.out.println("Przed Sortowaniem");
        for(Employee employee : employees){
            System.out.println(employee);
        }
        Arrays.sort(employees);
        System.out.println("Po sortowaniu");
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }
}
