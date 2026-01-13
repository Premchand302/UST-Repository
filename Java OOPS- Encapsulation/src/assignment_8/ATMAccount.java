package assignment_8;

public class ATMAccount {
    private int pin;
    private double balance;

    public ATMAccount(int pin, double balance) {
        setPin(pin);          // validate PIN
        this.balance = balance;
    }
    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            System.out.println("PIN must be a 4-digit number");
        }
    }
    public void withdraw(double amount) {
    	if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
