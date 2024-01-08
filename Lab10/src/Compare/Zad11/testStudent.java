package Compare.Zad11;

public class testStudent {
    public static void main(String[] args) {
        Student[]students={
                new Student("Adam",4.5,1),
                new Student("Marcin",4.5,2),
                new Student("Ewa",3.5,3),
                new Student("Alicja",4,4)
        };

        System.out.println("Przed sortowaniem");
        for(Student student : students){
            System.out.println(student);
        }

        System.out.println("Po sortowaniu");
        for(Student student : students){
            System.out.println(student);
        }
    }
}
