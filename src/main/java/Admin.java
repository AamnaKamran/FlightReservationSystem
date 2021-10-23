import java.util.Scanner;

public class Admin extends User {

    public Admin() {
        Scanner obj = new Scanner(java.lang.System.in);

        java.lang.System.out.println("enter your name: ");
        this.name = obj.nextLine();

        java.lang.System.out.println("enter your email address: ");
        this.emailAddress = obj.nextLine();

        java.lang.System.out.println("enter your password: ");
        this.password = obj.nextLine();
    }

    public Admin(String emailAddress, String name, String password, boolean type) {
        super(emailAddress, name, password, type);
    }
}
