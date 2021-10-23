public class FlightFares {
    public FlightFares(){

    }

    void checkFares(String val1, String val2){
        if(val1.equals("Lahore") && val2.equals("Islamabad")){
            java.lang.System.out.println("FIRST CLASS: Rs. 115,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 95,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 65,000");
        }
        else if(val1.equals("Karachi") && val2.equals("Lahore")){
            java.lang.System.out.println("FIRST CLASS: Rs. 75,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 62,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 55,000");
        }
        else if(val1.equals("Peshawar") && val2.equals("Islamabad")){
            java.lang.System.out.println("FIRST CLASS: Rs. 75,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 62,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 55,000");
        }
        else if(val1.equals("Lahore") && val2.equals("Karachi")){
            java.lang.System.out.println("FIRST CLASS: Rs. 75,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 62,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 55,000");
        }
        else if(val1.equals("Karachi") && val2.equals("Lahore")) {
            java.lang.System.out.println("FIRST CLASS: Rs. 75,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 62,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 55,000");
        }
        else if(val1.equals("Islamabad") && val2.equals("London")) {
            java.lang.System.out.println("FIRST CLASS: Rs. 165,000");
            java.lang.System.out.println("BUSINESS CLASS: Rs. 149,000");
            java.lang.System.out.println("ECONOMY CLASS: Rs. 134,000");
        }
    }
}
