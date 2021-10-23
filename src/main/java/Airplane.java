import java.util.ArrayList;

public class Airplane {
    String name;
    ArrayList<Seat> seats = new ArrayList<Seat>();

    public Airplane(String name) {
        this.name=name;
    }

    void addSeats(){
        Seat seat = new Seat();

        for(int i=0; i<10; i++) {
            seat.seatNum = this.name + String.valueOf(i);
            seat.classType = 1;
            this.seats.add(seat);
        }

        double number = Math.random()+0.1;
        number*=10;
        int i = (int) Math.round(number);

        for(int x=0; x<i; x++){
            seat.seatNum = this.name + String.valueOf(i);
            seat.classType = 2;
            this.seats.add(seat);
        }

        number = Math.random()+0.1;
        number*=10;
        i = (int) Math.round(number);

        for(int x=0; x<i; x++){
            seat.seatNum = this.name + String.valueOf(i);
            seat.classType = 2;
            this.seats.add(seat);
        }
    }
}
