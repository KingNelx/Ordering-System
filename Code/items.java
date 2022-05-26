package Code;

import java.util.Scanner;
import java.util.ArrayList;

public class items {
    Scanner input = new Scanner(System.in);
    ArrayList<String>orders = new ArrayList<>();

    String drink;
    String burger;
    String pizza;
    int quantity = 0;

    public void Drinks(){
        System.out.println("      ---------------- ");
        System.out.println("      Available Drinks ");
        System.out.println("      ---------------- ");
        System.out.println("  Drinks             Price");
        System.out.println(" [Coke       ||     ₱15pesos] ");
        System.out.println(" [Sprite     ||     ₱20pesos] ");
        System.out.println(" [Royal      ||     ₱25pesos] ");
        System.out.println(" [Water      ||     ₱30pesos] ");

        System.out.print(" Select your order: ");
        drink = input.nextLine();

        System.out.print(" How many?: ");
        quantity = input.nextInt();

        orders.add(drink);
    }

    public void Burgers(){
        System.out.println("      ---------------- ");
        System.out.println("      Available Burgers ");
        System.out.println("      ---------------- ");
        System.out.println("  Drinks                     Price");
        System.out.println(" [Regular Burger     ||    ₱17pesos] ");
        System.out.println(" [Cheese Burger      ||    ₱25pesos] ");
        System.out.println(" [Overload Burger    ||    ₱40pesos] ");
        System.out.println(" [Chicken Burger     ||    ₱50pesos] ");

        System.out.print(" Select your order: ");
        burger = input.nextLine();

        System.out.print(" How many?: ");
        quantity = input.nextInt();

        orders.add(burger);
    }

    public void Pizza(){
        System.out.println("      ---------------- ");
        System.out.println("      Available Pizza ");
        System.out.println("      ---------------- ");
        System.out.println("  Drinks                     Price");
        System.out.println(" [Regular Pizza    ||    ₱145pesos] ");
        System.out.println(" [Spinach Pizza    ||    ₱230pesos] ");
        System.out.println(" [Overload Pizza   ||    ₱330pesos] ");
        System.out.println(" [Beefy  Pizza     ||    ₱520pesos] ");

        System.out.print(" Select your order: ");
        pizza = input.nextLine();

        System.out.print(" How many?: ");
        quantity = input.nextInt();

        orders.add(pizza);
    }

    public void options(int choice) {
        do{
        try {
            switch (choice) {
                case 1 -> {
                    Drinks();
                    break;
                }

                case 2 -> {
                    Burgers();
                    break;
                }

                case 3 -> {
                    Pizza();
                    break;
                }

                case 4 -> {
                    showOrders();
                }
                case 5 -> {
                    System.out.println(" Have a nice Day! ");
                    System.exit(0);
                }
                default -> {
                    System.out.println(" Sorry that's not on the list of choices .");
                    System.out.println(" Have a nice Day !");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        }while(choice != 5);
    }

    public void choices(){
        System.out.println(" --Select Order-- ");
        System.out.println(" 1. Drinks ");
        System.out.println(" 2. Burgers ");
        System.out.println(" 3. Pizza ");
        System.out.println(" 4. Show Orders ");
        System.out.println(" 5. Exit");
    }

    public void showOrders(){
        if(orders.isEmpty()){
            System.out.println(" Its Empty ");
            System.out.println("");
            choices();
        }else{
            for(String myOrders : orders){
                System.out.println(myOrders);
            }
        }
    }
}
