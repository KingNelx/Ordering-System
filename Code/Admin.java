package Code;

import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);
    Alerts alert = new Alerts();
    private static String adminUser = "KingNelx";
    private static String adminPass = "Password";

    private String username;
    private String password;

    public void admin(){
        System.out.print(" Admin user: ");
        username = input.nextLine();

        System.out.print(" Admin password: ");
        password = input.nextLine();

        if(username.equals(adminUser)){
            if(password.equals(adminPass)){
               String msg1 = alert.Success();
                System.out.println(msg1);
            }
        }else{
            String msg2 = alert.Fail();
            System.out.println(msg2);
        }
    }
}
