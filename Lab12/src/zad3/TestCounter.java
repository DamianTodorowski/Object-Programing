package zad3;

public class TestCounter {
    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Element 1");
        stringCounter.add("Element 2");

        System.out.println("Liczba Stringów: " + stringCounter.getCount());

        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(2);
        integerCounter.add(3);

        System.out.println("Liczba intów: " + integerCounter.getCount());
    }
}
