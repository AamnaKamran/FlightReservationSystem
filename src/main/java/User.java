import java.util.Scanner;

public class User {
    String emailAddress;
    String name;
    String password;
    boolean type; //0 Admin; 1 Customer

    public User() {
    }

    public User(String emailAddress, String name, String password, boolean type) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
        this.type = type;
    }
}
