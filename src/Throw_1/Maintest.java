package Throw_1;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account n = new Account();
		
		System.out.println("Current balance:" + n.balance());
		n.withdraw(5000);
		System.out.println("Current balance:" + n.balance());
	}

}
