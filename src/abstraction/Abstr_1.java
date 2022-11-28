package abstraction;

public class Abstr_1 extends Abstr{

	
	@Override
	public void m1() {
		System.out.println("abstract method 1");
		
	}

	@Override
	void m3() {
		System.out.println("abstract method 2");
		
	}

	@Override
	protected void m4() {
	  System.out.println("abstract method 3");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Abstr h = new Abstr_1();//up casting
//		
//		h.m1();
//		h.m3();
//		h.m4();
//		h.m5();
//		h.m7();//m6 is private method that's why we can't call it
//		h.m8();
//		h.m9();
//		h.main(args);
		
		
		//main method also we can call with the help of object of another class
		//constructor is called directly without any help
		//if we are extends abtract class in regular class then firstly need to add unimplement methods (means we are did complete all abstract methods under the abstract class under the regular class) under the regular class

		
		Abstr_1 h = new Abstr_1();//child class object
	
		h.m1();
		h.m3();
		h.m4();
		h.m5();
		h.m7();//m6 is private method that's why we can't call it
		h.m8();
		h.m9();
		//h.main(args);	
		

		//if we can call main method of parent class with the help of child class object then we get infinite iterations of our output
		//constructor is called directly without any help
		//if we are extends abstract class in regular class then firstly need to add unimplement methods (means we are did complete all abstract methods under the abstract class under the regular class) under the regular class	
	}

}














