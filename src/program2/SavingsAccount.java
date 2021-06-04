package program2;

public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }
    @Override
    public void withdraw(double amount){
        double x = getBalance();
        if(getBalance()-amount<0){
            System.out.println("Insufficient Funds");
    }
    else{
           setBalance(x-amount);
        }

    }
}
