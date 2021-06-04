package program2;

public class CheckingAccount extends Account {
    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }
    @Override
    public void withdraw(double amount){
        double x = getBalance();
        if(getBalance()-amount< -50){
            System.out.println("Insufficient Funds");
        }
        else{
            setBalance(x-amount);
        }

    }
}

