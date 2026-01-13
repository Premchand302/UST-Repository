package assignment_5;

class Bank {
    double interestRate;
}

class SavingAccount extends Bank {

    void calculateInterest(double amount) {
        interestRate = 5.0; 
        double interest = (amount * interestRate) / 100;
        System.out.println("Amount        : " + amount);
        System.out.println("Interest Rate : " + interestRate);
        System.out.println("Interest      : " + interest);
    }
}

public class Main_5 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(); 
        sa.calculateInterest(10000);
    }
}