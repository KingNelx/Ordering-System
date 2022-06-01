package Code;
import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);
    UserOption option = new UserOption();

//    int test; for testing
    int choice;
    public void user(){
        option.userOpt();
        System.out.print(" Select option: ");
        choice = input.nextInt();

        if(choice == 1){
            System.out.println(" Food ");
            System.exit(0);
        }
    }

    public void test1(){
        System.out.println(" Test ");
        System.exit(0);
    }
}
