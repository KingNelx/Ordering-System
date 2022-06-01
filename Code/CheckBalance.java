package Code;
import java.util.Random;

public class CheckBalance {
    public boolean isBalanceEnough(int balance, int cost){
        return balance > cost;
    }

    public int getMoney(){
        int[]balance = {300, 500, 600, 700, 800, 1000};
        Random random = new Random();
        int myMoney = random.nextInt(balance.length);
        return balance[myMoney];
    }
}
