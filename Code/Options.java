package Code;

import java.util.Scanner;

public class Options {
    private Scanner input = new Scanner(System.in);
    Orders order = new Orders();

    public void SecurityCheck(){
        System.out.println(" 1. Login ");
        System.out.println(" 2. Create Account ");
        System.out.println(" 3. Check wallet ");
        System.out.println(" 4. Buy Food ");
        System.out.println(" 5. Exit ");
    }

    public void Foods(){
        int choice;

        System.out.println(" Buy Some Food ");
        System.out.println(" 1. Pizza ");
        System.out.println(" 2. Burgers ");
        System.out.println(" 3. Drinks ");
        System.out.println(" 4. Fries ");
        System.out.println(" 5. Desserts ");

        System.out.print(" Select: ");
        choice = input.nextInt();

        switch (choice){
            case 1 ->{
                order.Pizza();
                break;
            }

            case 2 ->{
                order.Burgers();
                break;
            }

            case 3 ->{
                order.Drinks();
                break;
            }

            case 4 ->{
                order.Fries();
                break;
            }

            case 5 ->{
                order.Desserts();
                break;
            }
        }
    }

}

