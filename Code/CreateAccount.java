package Code;

import java.util.Scanner;
import java.util.ArrayList;

public class CreateAccount {

    Alerts alert = new Alerts();

    ArrayList<String>firstname = new ArrayList<>();
    ArrayList<String>lastname = new ArrayList<>();
    ArrayList<String>username = new ArrayList<>();
    ArrayList<String>passwords = new ArrayList<>();



    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean accountCreated = false;

    private String user;
    private String pass;
    private String msg1;
    private String msg2;
    private String msg3;
    private String msg4;
    private String msg5;

    Scanner input = new Scanner(System.in);

    public void createAccount(){
        System.out.print(" Enter firstname: ");
        firstName = input.nextLine();

        System.out.print(" Enter lastname: ");
        lastName = input.nextLine();

        System.out.print(" Enter username: ");
        userName = input.nextLine();

        System.out.print(" Enter password: ");
        password = input.nextLine();

        accountCreated = true;

        printInfo();

    }

    User users = new User();

    public void Login(){
       if(accountCreated == true){
           System.out.print(" Enter username: ");
           user = input.nextLine();

           System.out.print(" Enter password: ");
           pass = input.nextLine();

           if(user.equals(userName) && pass.equals(password)){
               msg4 = alert.Success();
               System.out.println(msg4);
               users.user();

           }else{
               msg1 = alert.Fail();
               System.out.println(msg1);
           }
       }else{
           msg2 = alert.accountNotCreated();
           msg3 = alert.SweetMsg();
           System.out.println(msg2);
           System.out.println(msg3);
       }
    }

    public void printInfo(){
        firstname.add(userName);
        lastname.add(lastName);
        username.add(userName);
        passwords.add(password);

        for(String firstN : firstname){
            for(String lastN : lastname){
                for(String userN : username){

                    System.out.println(" Account successfully created . ");
                    System.out.println("* Firstname: " + firstN);
                    System.out.println("* Lastname: " + lastN);
                    System.out.println("* Username: " + userN);
                }
            }
        }
    }
}
