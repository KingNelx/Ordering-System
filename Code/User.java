package Code;
import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);
    int test;
    public void user(){
        System.out.println(" Enter test ");
        test = input.nextInt();

        if(test == 1){
            test1();
        }
    }

    public void test1(){
        System.out.println(" Test ");
        System.exit(0);
    }
}
