package assignment_5;

public class BankAccount {
	long accountNumber;
	String holderName;
	double balance;
	BankAccount(long accountNumber, String holderName, double balance) {
	     this.accountNumber = accountNumber;
	     this.holderName = holderName;
	     this.balance = balance;
	 }

	void showAccount() {
	     System.out.println("Account Number: " + accountNumber);
	     System.out.println("Account Holder: " + holderName);
	     System.out.println("Balance: " + balance);
	    }
}
