package Code;
import java.util.Scanner;

public class CreateAccount {

    Scanner input = new Scanner(System.in);

    private String userName;
    private String password;

    public void createAccount(){

        System.out.println(" Create Account ");


        System.out.print(" Enter username: ");
        userName = input.nextLine();

        System.out.print(" Enter password: ");
        password = input.nextLine();

        System.out.println(" Username: " + userName);
        System.out.println(" Password: " + password);
    }
}
