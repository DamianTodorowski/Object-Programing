package sports;

public class TestAthlete {

    private static void changeTime(Athlete athlete, int index, double newTime) {
        double[] times = athlete.getTimes();
        if (index >= 0 && index < times.length) {
            times[index] = newTime;
        }
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        double[] times={10.2,12.1,13.4,10.3,12.2};
        Athlete a1 = new Athlete("Usain Bolt",times);
        Athlete cloneAthlete=a1.clone();
        System.out.println("czasy oryginału przed zmianą");
            for (double time : a1.getTimes()) {
                System.out.println(time);
            }

        System.out.println("czasy klona przed zmianą:");
            for (double time: cloneAthlete.getTimes()){
                System.out.println(time);
            }

            changeTime(a1,2,10.0);

        System.out.println("czasyoryginału po zmianie");
        for (double time : a1.getTimes()) {
            System.out.println(time);
        }

        System.out.println("czasy klona po zmianie:");
        for (double time: cloneAthlete.getTimes()){
            System.out.println(time);
        }
    }
}
