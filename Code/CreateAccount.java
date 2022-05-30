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
    private int count;

    private String user;
    private String pass;

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

        printInfo();
        count++;
    }

    public void Login(){
        System.out.print(" Enter username: ");
        user = input.nextLine();

        System.out.print(" Enter password: ");
        pass = input.nextLine();

        if(user.equals(userName) && pass.equals(password)){
            alert.Success();
        }else{
            alert.Fail();
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

                    System.out.println(" Credentials. ");
                    System.out.println(" Firstname: " + firstN);
                    System.out.println(" Lastname: " + lastN);
                    System.out.println(" Username: " + userN);
                }
            }
        }
    }
}
