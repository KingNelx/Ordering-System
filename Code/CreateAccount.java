package Code;

import java.util.Objects;
import java.util.Scanner;

public class CreateAccount {

    Scanner input = new Scanner(System.in);
    Alerts alert = new Alerts();

    private String userName;
    private String password;
    private String rePassword;

    public void createAccount(){
        System.out.println(" Create Account ");

        System.out.print(" Enter username: ");
        userName = input.nextLine();
        System.out.print(" Enter password: ");
        password = input.nextLine();
        System.out.print(" Re enter password: ");
        rePassword = input.nextLine();

        if(Objects.equals(password, rePassword)){
            String success = alert.success();
            System.out.println(success);
        }else{
            String fail = alert.error();
            System.out.println(fail);
        }

    }


}
