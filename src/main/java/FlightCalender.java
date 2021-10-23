import java.util.ArrayList;
import java.util.Date;

public class FlightCalender {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    void viewFlightCalender(String val1, String val2){
        java.lang.System.out.println("The available flights are: ");

        for(int i=0; i<flights.size(); i++){
            if(flights.get(i).origin.location.equals(val1) && flights.get(i).destination.location.equals(val2)) {
                java.lang.System.out.println("departure date: "+flights.get(i).departureDate);
                java.lang.System.out.println("arrival date: "+flights.get(i).arrivalDate);
                java.lang.System.out.println("\n \n");

                return;
            }
        }

        java.lang.System.out.println("no flights currently available for these locations");
    }
}
