package Code;
import java.util.Random;

public class Wallet {


    public void wallet(){
        System.out.println(" Balance: " + Balance() +"Php");
    }

    public int Balance(){
        int []randomBalance = {200, 400, 600, 700, 800, 1000};
        Random random = new Random();
        int myBalance = random.nextInt(randomBalance.length);
        return randomBalance[myBalance];
    }

}
