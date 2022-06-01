package Code;
import java.util.Scanner;


public class User {
    Scanner input = new Scanner(System.in);
    UserOption option = new UserOption();


    Foods food = new Foods();
//    int test; for testing
    int choice;
    public void user(){
        option.userOpt();
        System.out.print(" Select option: ");
        choice = input.nextInt();

        if(choice == 1){
            food.foods();
        }
    }

    public void test1(){
        System.out.println(" Test ");
        System.exit(0);
    }

}
