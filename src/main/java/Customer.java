import java.util.Scanner;

public class Customer extends User{
    int refcode;
    String passportNum;
    int age;
    char gender;
    String address;
    Flight flight;
    Seat seat;

    public Customer() {
        Scanner obj = new Scanner(java.lang.System.in);

        java.lang.System.out.println("Sign up to book flights!");

        java.lang.System.out.println("enter your name: ");
        this.name = obj.nextLine();

        java.lang.System.out.println("enter your email address: ");
        this.emailAddress = obj.nextLine();

        java.lang.System.out.println("enter your password: ");
        this.password = obj.nextLine();

        java.lang.System.out.println("enter your passport number: ");
        this.passportNum = obj.nextLine();

        java.lang.System.out.println("enter your gender: ");
        this.gender = obj.next().charAt(0);

        java.lang.System.out.println("enter your age: ");
        this.gender = obj.next().charAt(0);

        java.lang.System.out.println("enter your address: ");
        this.address = obj.nextLine();
    }

    public Customer(String emailAddress, String name, String password, boolean type, String passportNum, char gender, String address) {
        super(emailAddress, name, password, type);
        this.passportNum = passportNum;
        this.gender = gender;
        this.address = address;
    }
}
