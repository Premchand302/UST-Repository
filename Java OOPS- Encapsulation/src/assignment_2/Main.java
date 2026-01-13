package assignment_2;

public class Main {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.setAccountNumber(123123123);
		acc.setBalance(34444);
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
	}
}
