package math.logarithm;

public class TestLogarithmCalculator {
    public static void main(String[] args) {
        SimpleLogarithmCalculator s1 = new SimpleLogarithmCalculator();
        System.out.println(s1.calculateLog(5));
        System.out.println(s1.isGreaterThanOne(5));
        SimpleLogarithmCalculator s2 = new SimpleLogarithmCalculator();
        System.out.println(s2.calculateLog(10));
        System.out.println(s2.isGreaterThanOne(10));
    }
}
