package assignment;

public class Assignment_8 {
	public static void main(String[] args) {
		int min = 1000;
		try {
			int balance = 500;
			if(balance < min) {
				throw new InvalidBalanceException("Balance is below minimum balance");
			}
		}
		catch(InvalidBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
