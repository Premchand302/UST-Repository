package assignment_2;

public class BankAccount {
	private long accountNumber;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance < 0) {
			System.out.println("Balance cannot be negative");
		}
		else {
			this.balance = balance;
		}
	}
}	
