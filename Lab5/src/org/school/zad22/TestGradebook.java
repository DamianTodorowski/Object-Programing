package org.school.zad22;

public class TestGradebook {
    public static void main(String[] args) {
        Gradebook g1 = new Gradebook("Adam", "Kokon");
        g1.addGrade(5);
        g1.addGrade(3);
        g1.addGrade(4);
        g1.addGrade(3);
        System.out.println("oceny przed usunieciem"+g1.getGrades());
        g1.removeGrade(3);
        System.out.println("oceny po usunieciu"+g1.getGrades());
        System.out.println("srednia ocen:"+g1.averageGrade());
    }
}
