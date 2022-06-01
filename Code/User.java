package Code;
import java.util.Scanner;


public class User {
    Scanner input = new Scanner(System.in);
    Scanner drink = new Scanner(System.in);
    Scanner burger = new Scanner(System.in);
    Scanner pizza = new Scanner(System.in);
    Scanner fries = new Scanner(System.in);
    Scanner dessert = new Scanner(System.in);

    UserOption option = new UserOption();
    Foods food = new Foods();
//    int test; for testing
    private int choice;
    private int drinkOrder;
    private int burgerOrder;
    private int pizzaOrder;
    private int friesOrder;
    private int dessertOrder;
    private int myOrder;
    private int cost;
    private int order;
    public void user(){
        option.userOpt();
        System.out.print(" Select option: ");
        choice = input.nextInt();

        if(choice == 1){
            food.foods();
            System.out.print(" Select what to order: ");
            order = input.nextInt();

            switch (order){
                case 1 ->{
                    food.Drinks();
                    System.out.print(" Select order: ");
                    drinkOrder = drink.nextInt();

                    System.out.print(" How many?: ");
                    int count1 = input.nextInt();

                    if(drinkOrder == 1){
                        System.out.println(" You order " + count1 + " Bottles of Coke ");
                        cost = 15 * count1;
                        System.out.print(" Total cost: " + cost + "PHP");
                        System.exit(0);
                    }
                }
            }


        }
    }

    public void test1(){
        System.out.println(" Test ");
        System.exit(0);
    }

}
