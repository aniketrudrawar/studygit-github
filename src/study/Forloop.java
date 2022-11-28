package study;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int a=0;a<=10;a++) {//initialize,condition and updation all are used in one bracket
			
			if (a==5) {
				
				continue;//if continue use in that then respected variable value not shown in output it will not execute that statement
			}
			
			System.out.println(a);//after that give only printing statement under the body
			
		}

	}

}
//we are used continue by using if statement