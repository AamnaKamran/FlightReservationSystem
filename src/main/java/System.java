import java.util.ArrayList;
import java.util.Scanner;

public class System {
    ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    FlightFares flightDescription = new FlightFares();
    FlightCalender calender = new FlightCalender();
    ArrayList<Flight> allFlights = new ArrayList<Flight>();
    ArrayList<User> admins = new ArrayList<User>();
    ArrayList<User> customers = new ArrayList<User>();

    void newCustomerAccount(){
        User cust = new Customer();
        cust.type = true;
        customers.add(cust);
    }

    void newAdminAccount(){
        User admin = new Admin();
        admin.type = false;
        admins.add(admin);
    }

    void Setup(){

        User admin = new Admin("afa.kamran2000@gmail.com","Aamna Kamran","password",false);
        admins.add(admin);

        admin = new Admin("Safa Zaid","suf01@gmail.com","p@assword",false);
        admins.add(admin);

        Airplane plane1 = new Airplane("AE50");
        plane1.addSeats();
        Airplane plane2 = new Airplane("AK87");
        plane2.addSeats();
        Airplane plane3 = new Airplane("MT90");
        plane3.addSeats();
        Airplane plane4 = new Airplane("PK496");
        plane4.addSeats();

        Airport one = new Airport("Allama Iqbal International Airport", "Lahore");
        Airport two = new Airport("Islamabad International Airport", "Islamabad");
        Airport three = new Airport("Jinnah International Airport", "Karachi");
        Airport four = new Airport("Bacha Khan International Airport", "Peshawar");
        Airport five = new Airport("Heathrow International Airport", "London");

        Flight flight1 = new Flight(one,two,"23/10","30/10",false,plane1);
        Flight flight2 = new Flight(three,one,"27/10","30/11",false,plane2);
        Flight flight3 = new Flight(four,two,"23/10","15/12",false,plane3);
        Flight flight4 = new Flight(one,three,"24/10","25/10",false,plane2);
        Flight flight5 = new Flight(two,five,"26/10","5/11",true,plane4);

        allFlights.add(flight1);
        allFlights.add(flight2);
        allFlights.add(flight3);
        allFlights.add(flight4);
        allFlights.add(flight5);

        calender.flights.add(flight1);
        calender.flights.add(flight2);
        calender.flights.add(flight3);
        calender.flights.add(flight4);
        calender.flights.add(flight5);
    }

    boolean login(){
        Scanner obj = new Scanner(java.lang.System.in);

        String option, id, pass;

        java.lang.System.out.println("press:\n1 for Administrator login\n2 for Customer login");
        option = obj.nextLine();

        java.lang.System.out.println("enter your email address: ");
        id = obj.nextLine();

        java.lang.System.out.println("enter your password: ");
        pass = obj.nextLine();

        if(option.equals("1")){
            for(int i=0; i< admins.size(); i++) {
                if(id.equals(admins.get(i).emailAddress)){
                    if(pass.equals(admins.get(i).password)){
                        java.lang.System.out.println("login sucessful!");
                        return true;
                    }
                    else return false;
                }
            }
        }
        else if(option.equals("2")){
            for(int i=0; i< customers.size(); i++) {
                if(id.equals(customers.get(i).emailAddress)){
                    if(pass.equals(customers.get(i).password)){
                        java.lang.System.out.println("login sucessful!");
                        return true;
                    }
                   else return false;
                }
            }
        }
        return false;
    }

    void viewFlightCalender(){
        Scanner obj = new Scanner(java.lang.System.in);

        String origin, destination;

        java.lang.System.out.println("flying from: ");
        origin = obj.nextLine();

        java.lang.System.out.println("flying to: ");
        destination = obj.nextLine();

        calender.viewFlightCalender(origin,destination);

    }

    void viewFlightFares(){
        Scanner obj = new Scanner(java.lang.System.in);

        String origin, destination;

        java.lang.System.out.println("flying from: ");
        origin = obj.nextLine();

        java.lang.System.out.println("flying to: ");
        destination = obj.nextLine();

        flightDescription.checkFares(origin,destination);
    }

    void bookFlight(){
        Scanner obj = new Scanner(java.lang.System.in);

        String origin, destination;
        String go, come;

        java.lang.System.out.println("flying from: ");
        origin = obj.nextLine();

        java.lang.System.out.println("flying to: ");
        destination = obj.nextLine();

        calender.viewFlightCalender(origin,destination);

        java.lang.System.out.println("departing: ");
        go = obj.nextLine();

        java.lang.System.out.println("returning: ");
        come = obj.nextLine();

        java.lang.System.out.println("proceeding to payment?");
    }

    void checkReservation(String emailID){

    }

    void printTicket(String customerEmailAddress){

    }
}
