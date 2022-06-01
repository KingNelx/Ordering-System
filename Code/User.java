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
        do {

            option.userOpt();
            System.out.print(" Select option: ");
            choice = input.nextInt();

            if (choice == 1) {
                food.foods();
                System.out.print(" Select what to order: ");
                order = input.nextInt();

                switch (order) {
                    case 1 -> {
                        food.Drinks();
                        System.out.print(" Select order: ");
                        drinkOrder = drink.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (drinkOrder == 1) {
                            System.out.println(" You order " + count1 + " Bottles of Coke ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if(drinkOrder == 2){
                            System.out.println(" You order " + count1 + " Bottles of Sprite ");
                            cost = 20 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (drinkOrder == 3){
                            System.out.println(" You order " + count1 + " Bottles of Royal ");
                            cost = 20 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (drinkOrder == 4){
                            System.out.println(" You order " + count1 + " Bottles of Water ");
                            cost = 20 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }
                    }
                    case 2 -> {
                        food.Burgers();
                        System.out.print(" Select order: ");
                        burgerOrder = drink.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (burgerOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Burgers ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (burgerOrder == 2){
                            System.out.println(" You order " + count1 + " Cheese Burgers ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (burgerOrder == 3){
                            System.out.println(" You order " + count1 + " Overload Burgers ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (burgerOrder == 4){
                            System.out.println(" You order " + count1 + " Chicken Burgers ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }
                    }

                    case 3 -> {
                        food.Pizza();
                        System.out.print(" Select order: ");
                        burgerOrder = drink.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (pizzaOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Pizza ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (pizzaOrder == 2){
                            System.out.println(" You order " + count1 + " Spinach Pizza ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (pizzaOrder == 3){
                            System.out.println(" You order " + count1 + " Overload Pizza ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (pizzaOrder == 4){
                            System.out.println(" You order " + count1 + " Beefy  Pizza ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }
                    }case 4 ->{
                        food.Fries();
                        System.out.print(" Select order: ");
                        friesOrder = drink.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (friesOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Fries ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (friesOrder == 2){
                            System.out.println(" You order " + count1 + " Curl Cheesy Fries ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (friesOrder == 3){
                            System.out.println(" You order " + count1 + " Pepereno Fries ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (friesOrder == 4) {
                            System.out.println(" You order " + count1 + " Honey  Fries ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }
                    }case 5 ->{
                        food.Desserts();
                        System.out.print(" Select order: ");
                        dessertOrder = drink.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (dessertOrder == 1) {
                            System.out.println(" You order " + count1 + " Ice Cream ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (dessertOrder == 2){
                            System.out.println(" You order " + count1 + " Mango Shake ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (dessertOrder == 3){
                            System.out.println(" You order " + count1 + " Blue Berry Cake ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }else if (dessertOrder == 4) {
                            System.out.println(" You order " + count1 + " Grape Juice ");
                            cost = 15 * count1;
                            System.out.println(" Total cost: " + cost + "PHP");
                            System.out.print(" Input payment: ");
                            balance = input.nextInt();

                            if (checkMoney.isBalanceEnough(balance, cost)) {
                                System.out.println(" Total cost: " + cost + "PHP");
                                System.out.println(" You pay: " + balance + "PHP");
                                change = balance - cost;
                                System.out.println(" Total change: " + change + "PHP");
                            } else {
                                System.out.println(" Your money is not enough .. ");
                                System.exit(0);
                            }
                        }
                    }

                    default -> {
                        System.out.println(" Invalid option, please select option again. ");
                        break;
                    }
                }


            }
        }while (choice != 3);
    }

//    public void test1(){
//        System.out.println(" Test ");
//        System.exit(0);
//    }

}
