package testing;

public class CompareandPrint {
    public static <T> void compareAndPrint(T arg1, T arg2){
        if(arg1.equals(arg2)==true){
            System.out.println("Argumenty są równe");
        }
        else {
            System.out.println("argumenty nie są równe");
        }
    }
}
