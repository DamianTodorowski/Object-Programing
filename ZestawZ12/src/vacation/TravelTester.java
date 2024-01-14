package vacation;

public class TravelTester  {
    public static void main(String[] args) {
        RoadTripPlanner r1 =  new RoadTripPlanner();
        FlightPlanner f1 = new FlightPlanner();
        r1.planRoute("Paris");
        r1.cancelTrip();
        f1.planRoute("Tokyo");
        f1.cancelTrip();

        String travelMode = TravelPlanner.getTravelMode();
        System.out.println(travelMode);
    }

}
