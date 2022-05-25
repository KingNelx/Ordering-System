package Code;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String>s1 = new ArrayList<>();
        items s2 = new items();

        System.out.println(" What is your order? ");
        String order = input.nextLine();

        s1.add(order);

        System.out.println(" How many?");
        int count = input.nextInt();

    }
}
