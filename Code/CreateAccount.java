package Code;

import java.util.Objects;
import java.util.Scanner;

public class CreateAccount {
    public int count = 0;
    public boolean accountCreated = false;

    Scanner input = new Scanner(System.in);
    Alerts alert = new Alerts();


    private String userName;
    private String password1;
    private String rePassword;



    public void createAccount(){
        System.out.println(" Create Account ");

        System.out.print(" Enter username: ");
        userName = input.nextLine();
        System.out.print(" Enter password: ");
        password1 = input.nextLine();
        System.out.print(" Re enter password: ");
        rePassword = input.nextLine();

        if(Objects.equals(password1, rePassword)){
            String success = alert.success();
            System.out.println(success);
            accountCreated = true;
            count++;

        }else{
            String fail = alert.error();
            System.out.println(fail);
        }
    }

    public void login(){
        String username;
        String password;

        System.out.print(" Enter username: ");
        username = input.nextLine();
        System.out.print(" Enter password: ");
        password = input.nextLine();


        if(accountCreated == false){
            System.out.println(" Account does not exist. ");
            System.exit(0);
        }
        if(Objects.equals(password, password1)){
            System.out.println(" Success");
            count++;
        }else{
            System.out.println(" Error");
            System.exit(0);
        }


    }


}
