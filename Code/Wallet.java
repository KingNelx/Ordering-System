package Code;
import java.util.Random;

public class Wallet {
    CreateAccount s1 = new CreateAccount();

    public void wallet(){
        System.out.println(" Balance: " + Balance() +"Php");
        System.out.println(s1.accountCreated);
    }

    public int Balance() {

        if (s1.accountCreated) {
            int[] randomBalance = {200, 400, 600, 700, 800, 1000};
            Random random = new Random();
            int myBalance = random.nextInt(randomBalance.length);
            return randomBalance[myBalance];
        }
        return 0;
    }

}
