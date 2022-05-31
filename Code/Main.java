package Code;
import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        int choice = 0;
        Scanner input = new Scanner(System.in);
        Options opt = new Options();

        do{
        opt.options();
        System.out.print(" Select option: ");
        choice = input.nextInt();
        opt.check(choice);
        }while(choice !=4);
    }
}