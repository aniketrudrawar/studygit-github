package Throw_1;

public class Account {
	
	private int balance = 3000;
	
	public int balance() {
		return balance;
	}
	
	public void withdraw(int ammount) {
		if(ammount>balance) {
			
			throw new InsufficientFundException ("insufficient balance is in your account");
			
		}
		balance = balance-ammount;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
