package assignment_8;

public class Main {
	public static void main(String[] args) {
        ATMAccount account = new ATMAccount(1234, 10000);
        account.withdraw(3000);  
        account.withdraw(8000);   
    }
}
