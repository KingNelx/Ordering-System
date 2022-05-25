package Code;

public class payment {

    public void checkPayment(int balance, int cost){
        if(cost > balance){
            System.out.println(" Im sorry, it seem that your balance is not enough. ");
            System.out.println(" Total Balance: " + balance);
        }else{
            balance = balance - cost;
            System.out.println(" Successfully purchased ");
            System.out.println();
        }
    }
}
