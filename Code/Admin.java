package Code;

import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);

    private static String adminUser = "KingNelx";
    private static String adminPass = "Password";

    private String username;
    private String password;

    public void admin(){
        System.out.print(" Admin user: ");
        username = input.nextLine();

        System.out.print(" Admin password: ");
        password = input.nextLine();
    }
}
