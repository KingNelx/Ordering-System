package Code;
import java.util.Scanner;
import java.util.LinkedList;

public class User {
    Scanner input = new Scanner(System.in);
    UserOption option = new UserOption();
    LinkedList<String>foods = new LinkedList<>();
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
