import java.util.Date;

public class Flight {
    Airport origin;
    Airport destination;
    String departureDate;
    String arrivalDate;
    boolean type; //0 direct; 1 indirect
    Airplane airplane;

    public Flight(Airport origin, Airport destination, String departureDate, String arrivalDate, boolean type, Airplane airplane) {
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.type = type;
        this.airplane = airplane;
    }

    public Flight() {

    }
}
