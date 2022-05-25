package Code;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String>s1 = new ArrayList<>();
        items s2 = new items();

        int balance = 500;
        int total = 0;

        System.out.println(" What is you're order? ");
        String order = input.nextLine();

        System.out.println(" Quantity ? ");
        int quantity = input.nextInt();

        s1.add(order);

        if(s1.contains("Burger")){
            System.out.println(" Your Order is: " + " " + quantity + " " + order);
            total = total * quantity;
        }else if (s1.contains("Cheese")){
            System.out.println(" Your Order is: " + " " + quantity + " " + order);
        }




    }
}
