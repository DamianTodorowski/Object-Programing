package date;

public class TestImmutableDate {
    public static void main(String[] args) {
        ImmtableDate i1 = new ImmtableDate(2020, 1, 2);
        ImmtableDate i2 = new ImmtableDate(2024,15, 1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i1));
        System.out.println(i2.hashCode());
        System.out.println(i1.hashCode());
    }

}
