public class Atm {
    private int balance;
    private String pin;

    //constructor
    public Atm(int balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    //getter
    public int getBalance() {
        return balance;
    }

    //behavioral methods
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        } else{
            System.out.println("Insufficient funds to execute withdrawal, please try again");
        }

    }

    public boolean accessAccount(String pinEntered) {
        if (pinEntered.equals(pin)) {
            return true;
        }
        return false;
    }
}
