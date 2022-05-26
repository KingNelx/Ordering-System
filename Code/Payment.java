package Code;

public class Payment {

    public void checkPayment(int cost, int balance){
        if(cost > balance){
            System.out.println(" Sorry i think your balance is not enough .. ");
            System.out.println(" Total Cost: " + cost);
            System.out.println(" Total Balance: " + balance);
        }else{
            System.out.println(" Purchased successfully ");
            System.out.println(" Total Balance: " + balance);
            balance = balance - cost;
            System.out.println(" Total Cost: " + cost);
            System.out.println(" Change: " + balance);
            System.out.println(" Have a nice Day.. ");
        }
    }

}
