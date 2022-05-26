package Code;
import java.util.Random;

public class randomBalance {
    public int myBalance() {
        int[] moneyGenerator = {300, 500, 700, 900, 1000, 1200, 1500, 2000};
        Random random = new Random();
        int balance = random.nextInt(moneyGenerator.length);
        return moneyGenerator[balance];
    }
}