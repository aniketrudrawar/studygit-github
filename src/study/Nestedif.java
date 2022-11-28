package study;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		if(a>10) {
			if(a<10) {
				
				System.out.println("both conditions are true");//if both conditions are true then print this
				
			}
		
		else {
			System.out.println("second conditiob is wrong");//if first condition is true and second condition is false then print this
		}
		}
		else {
			System.out.println("first condition is wrong");//if first is false then print this there is  no impaact of second condition
		}

	}

}
