package optimize;

public class findMax {
    public static<T extends Comparable<T>> T findMax(T a, T b, T c){
        if(a.compareTo(b)>=0){
            if(a.compareTo(c)>=0){
                return a;
            }
            return c;
        }
        else if(b.compareTo(a)>=0){
            if(b.compareTo(c)>=0){
                return b;
            }
            return c;
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(findMax(4,6,10));
        System.out.println(findMax("bla","blam","aota"));
    }
}
