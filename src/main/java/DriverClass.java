import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        //initial setup
        System system = new System();
        system.Setup();
        Scanner obj = new Scanner(java.lang.System.in);
        String input;

        int tries=3;
        boolean proceed=false;

        java.lang.System.out.println("press:\n" +
                "1 to Log in\n" +
                "2 to Resgister\n");
        input = obj.nextLine();

        if(input.equals("1")) {
            while (!system.login() && tries != 0) {
                proceed = true;
            }
            if (tries == 0) {
                proceed = false;
                java.lang.System.out.println("log in failed!\ntry again later");
            }
        }

        else if(input.equals("2")) {
            system.newCustomerAccount();
            proceed=true;
        }

        while(proceed) {
            java.lang.System.out.println("press:\n" +
                    "1 to check your booking\n" +
                    "2 to book a flight\n" +
                    "3 to view flight calender\n" +
                    "4 to check flight fares\n" +
                    "5 to print ticket\n" +
                    "6 to log out");

            input = obj.nextLine();

            if(input.equals("1")){
                java.lang.System.out.println("CHECK FLIGHT BOOKING");
            }
            else if(input.equals("2")){
                java.lang.System.out.println("BOOK FLIGHT");
                system.bookFlight();
            }
            else if(input.equals("3")){
                java.lang.System.out.println("VIEW FLIGHT CALENDER");
                system.viewFlightCalender();
            }
            else if(input.equals("4")){
                java.lang.System.out.println("CHECK FLIGHT FARES");
                system.viewFlightFares();
            }
            else if(input.equals("5")){
                java.lang.System.out.println("PRINT TICKET");
            }
            else{
                java.lang.System.out.println("THANK YOU FOR VISITING! :)");
                proceed=false;
            }
        }

        }

}
