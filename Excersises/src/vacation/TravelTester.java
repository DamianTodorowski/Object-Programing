package vacation;

public class TravelTester {
    public static void main(String[] args) {
        RoadTripPlanner r1 = new RoadTripPlanner();
        FlightPlanner f1=new FlightPlanner();
        r1.planRoute("Paris");
        f1.planRoute("New York");
        f1.cancelTrip();

        TravelPlanner.getTravelMode();

    }
}
