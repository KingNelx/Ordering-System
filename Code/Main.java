package Code;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        int choice;

        Scanner input = new Scanner(System.in);

        Orders order = new Orders();
        Payment payment = new Payment();
        Options option = new Options();
        CreateAccount create = new CreateAccount();

        do {
            option.SecurityCheck();
            System.out.print(" Select your option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    create.login();
                    break;
                }
                case 2 -> {
                    create.createAccount();
                    break;
                }
            }
        }while (choice != 3);
    }
}
