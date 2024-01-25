package vacation;

public interface TravelPlanner {
    abstract void planRoute(String destination);

     default void cancelTrip(){
         System.out.println("Trip Cancelled");
     }

     static void getTravelMode(){
         System.out.println("Travel Mode:");
     }



}
