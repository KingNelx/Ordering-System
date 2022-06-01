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
    CheckBalance check = new CheckBalance();

    CheckBalance checkMoney = new CheckBalance();
    Foods food = new Foods();

    public void user(){
        //    int test; for testing
        int choice;
        do {

            option.userOpt();
            System.out.print(" Select option: ");
            choice = input.nextInt();

            if (choice == 1) {
                food.foods();
                System.out.print(" Select what to order: ");
                int order = input.nextInt();

                int change;
                int balance;

                int cost;
                switch (order) {
                    case 1 -> {
                        food.Drinks();
                        System.out.print(" Select order: ");
                        int drinkOrder = drink.nextInt();

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
                            cost = 25 * count1;
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
                            cost = 30 * count1;
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
                        int burgerOrder = burger.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (burgerOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Burgers ");
                            cost = 17 * count1;
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
                            cost = 25 * count1;
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
                            cost = 40 * count1;
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
                            cost = 50 * count1;
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
                        int pizzaOrder = pizza.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (pizzaOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Pizza ");
                            cost = 145 * count1;
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
                            cost = 230 * count1;
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
                            cost = 330 * count1;
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
                            cost = 520 * count1;
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
                        int friesOrder = fries.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (friesOrder == 1) {
                            System.out.println(" You order " + count1 + " Regular Fries ");
                            cost = 75 * count1;
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
                            cost = 130 * count1;
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
                            cost = 145 * count1;
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
                            cost = 220 * count1;
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
                        int dessertOrder = dessert.nextInt();

                        System.out.print(" How many?: ");
                        int count1 = input.nextInt();

                        if (dessertOrder == 1) {
                            System.out.println(" You order " + count1 + " Ice Cream ");
                            cost = 45 * count1;
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
                            cost = 70 * count1;
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
                            cost = 100 * count1;
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
                            cost = 120 * count1;
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

                    default ->
                        System.out.println(" Invalid option, please select option again. ");
                }

            }else if(choice == 2){
                System.out.println(" My wallet: " + check.getMoney());
            }
        }while (choice != 3);
    }

}
