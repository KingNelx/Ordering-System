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
    CheckBalance checkMoney = new CheckBalance();
    Foods food = new Foods();
//    int test; for testing
    private int choice;
    private int drinkOrder;
    private int burgerOrder;
    private int pizzaOrder;
    private int friesOrder;
    private int dessertOrder;
    private int myOrder;
    private int change;
    private int balance = 500;
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
                        System.out.println(" Total cost: " + cost + "PHP");
                        System.out.print(" Input payment: ");
                        balance = input.nextInt();

                        if(checkMoney.isBalanceEnough(balance, cost)){
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.println(" You pay: " + balance + "PHP");
                            change = balance - cost;
                            System.out.println(" Total change: " + change + "PHP");
                        }else{
                            System.out.println(" Your money is not enough .. ");
                            System.exit(0);
                        }
                    }
                }case 2 -> {

                }

                case 3 ->{
                    System.out.println(" Have a nice day !.");
                    break;
                }

                default -> {
                    System.out.println(" Invalid option, please select option again. ");
                    break;
                }
            }


        }
    }

    public void test1(){
        System.out.println(" Test ");
        System.exit(0);
    }

}
