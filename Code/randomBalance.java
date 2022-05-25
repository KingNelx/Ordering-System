package Code;
import java.util.Random;

final public class randomBalance {
    public int balanceGenerator(){
        int [] random = {300, 500, 800, 1000, 1500, 2000, 2300};
        Random random12 = new Random();
        int randomNumbers = random12.nextInt(random.length);
        return (random[randomNumbers]);
    }
}
