package Code;
import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        int choice;
        Scanner input = new Scanner(System.in);
        Options opt = new Options();

        opt.options();
        choice = input.nextInt();

    }
}
